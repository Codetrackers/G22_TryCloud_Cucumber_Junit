package com.tryCloud.page;

import com.tryCloud.utility.ConfigurationReader;
import com.tryCloud.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {


    @FindBy(id = "user")
    public static WebElement usernameBox;


    @FindBy(id = "password")
    public static WebElement passWordBox;


    @FindBy(id = "submit-form")
    public WebElement loginBtn;


    @FindBy(xpath = "//*[@*='warning wrongPasswordMsg']")
    public static WebElement warningMsg;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public static WebElement warningMessage;//updated xpath-Hamid

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Log in with a device']")
    public WebElement loginWithDeviceLink;

    public void goTo() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    public void login(){
        usernameBox.sendKeys("user52");
        passWordBox.sendKeys("Userpass123");
        loginBtn.click();
    }

}
