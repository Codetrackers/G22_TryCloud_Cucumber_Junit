package com.tryCloud.step_definition;

import com.tryCloud.page.DashboardPage;
import com.tryCloud.utility.BrowserUtils;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class US14_StepDef {

    DashboardPage dashboardPage = new DashboardPage();
    String getSearchValue = "";


    @When("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        dashboardPage.searchIcon.click();
    }

    @And("users search any existing {string} name")
    public void usersSearchAnyExistingName(String searchValue) {
        getSearchValue = searchValue;
        dashboardPage.searchBox.sendKeys(searchValue);
    }

    @Then("verify the app displays the expected result option")
    public void verifyTheAppDisplaysTheExpectedResultOption() {
        BrowserUtils.waitForClickablility(dashboardPage.searchBoxResult, 5);
        assertEquals(getSearchValue, dashboardPage.searchBoxResult.getAttribute("title"));
    }
}
