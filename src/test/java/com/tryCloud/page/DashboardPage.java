package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id]")
    public List<WebElement> mainModules;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='dashboard']/a")
    public WebElement dashboardModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']/a")
    public WebElement filesModule;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='photos']/a")
    public WebElement photosModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='activity']/a")
    public WebElement activityModule;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='spreed']/a")
    public WebElement talkModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='mail']/a")
    public WebElement mailModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='contacts']/a")
    public WebElement contactsModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='circles']/a")
    public WebElement circlesModule;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='calendar']/a")
    public WebElement calendarModule;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='deck']/a")
    public WebElement deckModule;


    @FindBy(xpath = "//a[@class='header-menu__trigger']")
    public WebElement searchButton;

    //@FindBy(xpath = "//input[@type='search']")
    //public WebElement searchBox;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notificationsButton;


    @FindBy(xpath = "//div[contains(@class,'unified-search')]/a")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public WebElement searchBoxResult;

    @FindBy(xpath = "//li[contains(@class,'router-link-exact-active active')]//span[contains(@class,'line-one__title')]")
    public WebElement searchResultForUser;


}
