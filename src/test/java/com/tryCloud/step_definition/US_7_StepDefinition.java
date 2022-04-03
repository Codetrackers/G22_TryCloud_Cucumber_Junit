package com.tryCloud.step_definition;

import com.tryCloud.page.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_7_StepDefinition {

    LogInPage logInPage = new LogInPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {

    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {

    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

    }


    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }




}
