

Feature: As a user, I should be able to delete a file/folder.
  Scenario: Verify users delete a file/folder
    Given user on the dashboard page
   When the user clicks the "Files" module
    And user clicks action icon from any file on the page
    And  user choose the "Delete file" option
    When user click the "Deleted files" sub-module on the left side
    Then verify the deleted file is displayed on the page