package com.tryCloud.step_definition;

import com.github.javafaker.Faker;
import com.tryCloud.page.*;
import com.tryCloud.utility.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_5 {
    LogInPage login = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filePage = new FilePage();
    FavoritePage favoritePage = new FavoritePage();
    Faker faker = new Faker();
    int num = faker.number().numberBetween(1,filePage.uploadedFilesSelectors.size());
    GeneralPage generalPage = new GeneralPage();
    String fileName="";
    //
//    @Given("user on the dashboard page")
//    public void user_on_the_dashboard_page() {
//        //login page
//        //  Driver.getDriver().get(ConfigurationReader.getProperty("env"));
//        login.goTo();
//        login.login();
//
//    }
//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//    dashboardPage.filesModule.click();
//    BrowserUtils.waitFor(5);
//
//
//    }
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        fileName = generalPage.fileName.get(num).getText();
        favoritePage.actionBtns.get(num).click();

        // Random file name
       // System.out.println(fileName);

        BrowserUtils.waitFor(5);
    }
    //
//    @When("user choose the {string} option")
//    public void user_choose_the_option(String string) {
//
//        for (WebElement eachOption : generalPage.threeDotOptions) {
//            if(eachOption.getText().contains(string)){
//                eachOption.click();
//                break;
//            }
//        }
//
//    }
//    @When("user click the {string} sub-module on the left side")
//    public void user_click_the_sub_module_on_the_left_side(String string) {
//
//
//    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        List<String> actualFavorites = new ArrayList<>();
        for (WebElement eachFile : generalPage.favoritesList) {
            actualFavorites.add(eachFile.getText());
        }
        // List of Favorites
        //System.out.println(actualFavorites);
        Assert.assertTrue(actualFavorites.contains(fileName));



    }
}
