package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilePage extends BasePage{


    @FindBy(xpath = "//ul[@class='with-icon']/li/a")
    public List<WebElement> subModules;

    @FindBy(xpath = "//div[contains(@class,'fileActionsMenu')]//a/span[2]")
    public List<WebElement> actionIconOptions;

    @FindBy(xpath = "//table[@id='filestable']//th[1]/label[@for='select_all_files']")
    public WebElement selectAllCheckBox;

    @FindBy(id = "app-navigation-toggle")
    public WebElement burgerButton;

    @FindBy(id = " //a[contains(@class,'action action-menu permanent')]")
    public WebElement firstActionIcon;

    @FindBy(id = "//a[@class = 'menuitem action action-favorite permanent']")
    public WebElement starButton;

    @FindBy(xpath = "//input[contains(@id,'select-files')]")
    public List<WebElement> uploadedFilesSelectors;

    @FindBy(css = "button.settings-button")
    public WebElement settingsButton;

    @FindBy(id = "showRichWorkspacesToggle")
    public WebElement workspacesCheckbox;

    @FindBy(id = "recommendationsEnabledToggle")
    public WebElement recommendationsCheckbox;

    @FindBy(id = "showhiddenfilesToggle")
    public WebElement hiddenFilesCheckbox;

    @FindBy(id = "quota")
    public WebElement storageUsageButton;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addNewFileButton;


    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileBtn;

@FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement deletedFilesFolder;
}
