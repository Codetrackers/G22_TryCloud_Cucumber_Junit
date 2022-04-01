package com.tryCloud.step_definition;

import com.tryCloud.page.DashboardPage;
import com.tryCloud.page.FilePage;
import com.tryCloud.page.LogInPage;
import com.tryCloud.utility.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class CommonDefinitions {

    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filePage = new FilePage();


    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        logInPage.goTo();
        logInPage.login();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String moduleName) {
        for (WebElement eachElement : dashboardPage.mainModulesList) {
            if(eachElement.getAttribute("aria-label").equals(moduleName)){
                eachElement.click();
                break;
            }
        }
    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModule) {
        for (WebElement eachSubModule : filePage.subModules) {
            if(eachSubModule.getText().equals(subModule)){
                eachSubModule.click();
                break;
            }
        }
    }


    @And("user choose the {string} option")
    public void userChooseTheOption(String actionIconOption) {
        for (WebElement eachOption : filePage.actionIconOptions) {
            if(eachOption.getText().equals(actionIconOption)){
                eachOption.click();
                break;
            }

        }

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitlePage) {

        BrowserUtils.verifyTitle(expectedTitlePage);
    }
}
