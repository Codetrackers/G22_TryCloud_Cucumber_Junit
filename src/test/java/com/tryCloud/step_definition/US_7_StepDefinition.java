package com.tryCloud.step_definition;

import com.tryCloud.page.GeneralPage;
import com.tryCloud.page.LogInPage;
import com.tryCloud.utility.BrowserUtils;
import com.tryCloud.utility.ConfigurationReader;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class US_7_StepDefinition {

    LogInPage logInPage = new LogInPage();
    GeneralPage generalPage = new GeneralPage();


    @Given("user on the dashboard page with {string} and {string}")
    public void user_on_the_dashboard_page_with_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        logInPage.usernameBox.sendKeys(username);
        logInPage.passWordBox.sendKeys(password);
        logInPage.loginBtn.click();
    }

    @When("user clicks the {string} module")
    public void user_clicks_the_module(String files) {
        BrowserUtils.waitFor(2);
        generalPage.fileModule.click();

    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitFor(2);
        generalPage.addIcon.click();

    }

    @When("user click new folder")
    public void user_click() {
        BrowserUtils.waitFor(2);
        generalPage.newFolder.click();

    }

    @When("user write a {string}")
    public void user_write_a_folder_name(String folderName) {
        BrowserUtils.waitFor(2);
        generalPage.inputFolderName.sendKeys(folderName);
    }

    @When("user click submit icon")
    public void user_click_submit_icon() {
        generalPage.submitIcon.click();
    }

    @Then("Verify the {string} is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page(String folderName) {
        Driver.getDriver().navigate().refresh();
        List<String> namesOfFiles = new ArrayList<>();
        for (WebElement fileName : generalPage.fileNames) {
            namesOfFiles.add(fileName.getText());
        }
        System.out.println("namesOfFiles = " + namesOfFiles);
        BrowserUtils.sleep(3);
        Assert.assertTrue(namesOfFiles.contains(folderName));
    }


    @When("user uploads {string} with the upload file option")
    public void user_uploads_file_with_the_upload_file_option(String path) {
        BrowserUtils.waitFor(5);
        Driver.getDriver().findElement(By.xpath("//input[@id='file_upload_start']")).sendKeys(path);
    }

    @Then("Verifies the {string} is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page(String path) {

        String fileName = path.substring(path.lastIndexOf('\\')+1,path.indexOf('.'));
        System.out.println(fileName);
        Driver.getDriver().navigate().refresh();

        List<String> uploadedNewFile = new ArrayList<>();
        for (WebElement newFile : generalPage.fileNames) {
            BrowserUtils.sleep(3);
            uploadedNewFile.add(newFile.getText());
        }
        System.out.println("uploadedNewFile = " + uploadedNewFile);
        BrowserUtils.sleep(3);
        Assert.assertTrue(uploadedNewFile.contains(fileName));
    }


}
