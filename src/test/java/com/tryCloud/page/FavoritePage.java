package com.tryCloud.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FavoritePage extends BasePage{


    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileNames;

    @FindBy(xpath = "//a[contains(@class,'action-menu')]//span[@class='icon icon-more']")
    public List<WebElement> actionBtns;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFav;
}
