package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class GeneralPage extends BasePage{
    // Please write you code just under your name.
    //Elkhan 6-16











    //Hamid 18-28











    //Roman 30-40








    //seper42-45
    @FindBy(xpath = "//*[@id='headerSelection']")
    public WebElement selectAllFilesCheckBox;

    //Olga 46-56
    @FindBy(xpath= "//td[@class='filename']//span[@class='innernametext']")
    public List<WebElement> favoritesList;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileName;

    //Karen 58-68











    //Tuya70-80

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='files']")
    public WebElement fileModule;
    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;
    @FindBy(xpath = "//*[@id=\"controls\"]//a/span[contains(.,'New folder')]")
    public WebElement newFolder;
    @FindBy(xpath = "//input[contains(@value,'New folder')]")
    public WebElement inputFolderName;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;
    @FindBy(xpath = "//div[@id='app-content-files'] //*[@class='innernametext']")
    //div[@id='app-content-files']
    public List<WebElement> fileNames;
    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFiles;






    //Konstantin 82-92











    //Marianna 94-104











    //Aykhan 106-116











    //Kidist 118-128











    //suhaib 130-140











    //Mert 142- 152



}
