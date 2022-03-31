package com.tryCloud.step_definition;

import com.tryCloud.page.DashboardPage;
import com.tryCloud.page.FilePage;
import com.tryCloud.page.GeneralPage;
import com.tryCloud.page.LogInPage;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_4 {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filesPage = new FilePage();
    GeneralPage generalPage= new GeneralPage();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        logInPage.goTo();
        logInPage.login();


    }

    @When("user clicks the {string} module")
    public void userClicksTheModule(String module) {
        for (WebElement eachModule : dashboardPage.mainModulesList) {
            if (eachModule.getAttribute("aria-label").equals(module)) {
                eachModule.click();
                break;
            }
        }
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    //Second Scenario


    @And("user clicks the top-left checkbox of the table")
    public void userClicksTheTopLeftCheckboxOfTheTable() {
        generalPage.selectAllFilesCheckBox.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement eachFile : filesPage.uploadedFilesSelectors) {
            assertTrue(eachFile.isSelected());
        }
    }
}
