package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeletePage {
    @FindBy(xpath = " //span[@class='innernametext']")
    public  List<WebElement> deletedItems;
    //tr//span[@class='innernametext']
}
