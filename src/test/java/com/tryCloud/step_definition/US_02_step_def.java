package com.tryCloud.step_definition;

import com.tryCloud.page.LogInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;


public class US_02_step_def {

    @When("user uses invalid {string} and {string}")
    public void userEntersInvalidUserNameAndPassword(String username, String password) {

        LogInPage.usernameBox.sendKeys(username);
        LogInPage.passWordBox.sendKeys(password);
    }

    @Then("verify {string} is displayed")
    public void verifyMessageShouldBeDisplayed(String message){
        LogInPage.warningMessage.getText().equals(message);

    }
}