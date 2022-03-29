package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkPage extends BasePage{
    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@class='conversations']//a")
    public List<WebElement> convList;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@aria-label='Send message' and @type='submit']")
    public WebElement sendMsgBtn;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> messagesSent;

    @FindBy(xpath = "//div[.='You created the conversation']")
    public WebElement convStartText;
}
