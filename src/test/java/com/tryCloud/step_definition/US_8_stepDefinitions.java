package com.tryCloud.step_definition;

import com.github.javafaker.Faker;
import com.tryCloud.page.*;
import com.tryCloud.utility.BrowserUtils;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class US_8_stepDefinitions {
    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filePage = new FilePage();
    FavoritePage favoritePage = new FavoritePage();
    GeneralPage generalPage = new GeneralPage();
    CommonDefinitions commonDefinitions = new CommonDefinitions();
    DeletePage deletePage = new DeletePage();
     Faker faker = new Faker();
       int num = faker.number().numberBetween(1,filePage.uploadedFilesSelectors.size());
     String fileNameToDelete ="";
    //US_5 us5 = new US_5();
    /*  @Given("user is on the dashboard page")
      public void user_is_on_the_dashboard_page() {

login page
  Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        login.goTo();
        login.login();

    }

      @When("user clicks the {string} module")
      public void user_clicks_the_module(String string) {
          // Write code here that turns the phrase above into concrete actions
          throw new io.cucumber.java.PendingException();
      }

*/

    @When("user clicks action icon from any file on the page")
    public void user_clicks_action_icon_from_any_file_on_the_page() {

        fileNameToDelete  = generalPage.fileName.get(num).getText();
        BrowserUtils.waitFor(3);
        favoritePage.actionBtns.get(num).click();
    }

  /* @When("user chooses the {string} option")
    public void userChooseTheOption(String subModule) {

    }
*/


     @Then("verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

         filePage.deletedFilesFolder.click();

      List<String> actualDeletedItem = new ArrayList<>();
        for (WebElement each : deletePage.deletedItems) {
            actualDeletedItem.add(each.getText());

        }
         System.out.println("actualDeletedItem = " + actualDeletedItem);
        Assert.assertTrue(actualDeletedItem.contains(fileNameToDelete));

    }




/*

  @Then("verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        filePage.deletedFilesFolder.click();

        WebElement deletedItems = Driver.getDriver().findElement(By.xpath("//span[@class='innernametext'][.='"+fileNameToDelete+"']"));
        assertTrue(deletedItems.isDisplayed());


    }



 */


}



