package com.tryCloud.step_definition;

import com.tryCloud.page.FilePage;
import com.tryCloud.page.LogInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US09_StepDef {

    LogInPage login = new LogInPage();

    FilePage file = new FilePage();

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

    }


}
