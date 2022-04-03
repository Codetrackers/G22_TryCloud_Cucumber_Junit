package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CommentPage extends BasePage{

    @FindBy (xpath = "//a/span[.='Actions']")
    public List<WebElement> actionIcon;

    @FindBy (xpath = "//a/span[.='Details']")
    public WebElement detailsIcon;

    @FindBy (xpath = "//a[@id='commentsTabView']")
    public WebElement commentBtn;

    @FindBy (xpath = "//section//div[@class='message']")
    public WebElement commentBox;

}
