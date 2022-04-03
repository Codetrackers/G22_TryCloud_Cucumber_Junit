package com.tryCloud.step_definition;

import com.tryCloud.page.CommentPage;
import com.tryCloud.page.DashboardPage;
import com.tryCloud.page.FilePage;
import com.tryCloud.page.LogInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US09_StepDef {

    CommonDefinitions commonDefinitions = new CommonDefinitions();
    CommentPage commentPage = new CommentPage();


        @When("user click action-icon  from any file on the page")
        public void user_click_action_icon_from_any_file_on_the_page () {
            for (WebElement eachElement : commentPage.actionIcons) {
                if (eachElement.getClass().equals("icon icon-more")) {
                    eachElement.click();
                    break;
                }
            }
        }

        @When ("user choose the Comments option")
        public void user_choose_the_Comments_option(String commentsTabView){

            commentsTabView = "app-sidebar-tabs__tab-icon icon-comment";

            for (WebElement eachOption : commonDefinitions.filePage.actionIconOptions) {
                if (eachOption.getClass().equals(commentsTabView)) {
                    eachOption.click();
                    break;
                }
            }
        }

        @When("user write a comment inside the input box")
        public void user_write_a_comment_inside_the_input_box() {
            /*
            String commentAdded = "Hello B25";
            for (WebElement eachElement : commentPage.commentBox) {
                if (eachElement.getClass().equals("message")) {
                    eachElement.sendKeys(commentAdded);
                    break;
                }
            }

             */
            String commentAdded = "Hello B25";
            commentPage.commentBox.sendKeys(commentAdded);
        }

        @When("user click the submit button to post it")
        public void user_click_the_submit_button_to_post_it () {
            commentPage.submitBtn.click();
        }

        @Then("Verify the comment is displayed in the comment section.")
        public void verify_the_comment_is_displayed_in_the_comment_section () {
            Assert.assertTrue(commentPage.hiddenTextMsg.isDisplayed());
        }

}
