package com.tryCloud.step_definition;

import com.tryCloud.page.DashboardPage;
import com.tryCloud.page.LogInPage;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class US_3_step_definitions {

    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user on the login page")
    public void user_on_the_login_page() {
       logInPage.goTo();
    }
    @When("the user log in with valid credentials")
    public void the_user_log_in_with_valid_credentials() {
       logInPage.login();
    }
    @Then("verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfAllElements(dashboardPage.mainModulesList));

        List<String> actualModules = new ArrayList<>();

        for (WebElement module : dashboardPage.mainModulesList) {
            actualModules.add(module.getAttribute("aria-label"));
        }

        Assert.assertEquals(expectedModules,actualModules);
    }

}
