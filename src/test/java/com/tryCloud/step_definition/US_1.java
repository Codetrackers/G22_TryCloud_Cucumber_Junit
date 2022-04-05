
package com.tryCloud.step_definition;

import com.tryCloud.page.BasePage;
import com.tryCloud.page.LogInPage;
import com.tryCloud.utility.ConfigurationReader;
import com.tryCloud.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_1 {

    BasePage basePage = new BasePage();
    LogInPage logInPage = new LogInPage();


    @Given("user on {string}")
    public void user_on_http_qa3_trycloud_net_index_php_login_clear(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user use usernamame {string} and {string}")
    public void userUseUsernamameAnd(String username, String password) {
        logInPage.usernameBox.sendKeys(username);
        logInPage.passWordBox.sendKeys(password);
    }


    @When("user click the login button")
    public void user_click_the_login_button() {
        logInPage.loginBtn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String expectedTitle = "Dashboard - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

