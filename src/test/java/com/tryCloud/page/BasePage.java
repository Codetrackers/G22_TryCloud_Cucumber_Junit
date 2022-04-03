package com.tryCloud.page;

import com.tryCloud.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}



