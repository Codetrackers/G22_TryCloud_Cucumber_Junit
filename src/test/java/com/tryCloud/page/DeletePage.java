package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeletePage extends BasePage {
    @FindBy(xpath = "//a[@class ='menuitem action action-delete permanent']")
    public WebElement deleteIcon;
    @FindBy(xpath = " //span[@class='innernametext']")
    public  List<WebElement> deletedItems;
    //tr//span[@class='innernametext']
}
