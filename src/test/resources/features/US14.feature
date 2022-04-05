Feature:  As a user, I should be able to search any item/ users from the homepage.


  Background:
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top

  Scenario: Verify users can search any files from the search box.
    And users search any existing "nn" name
    Then verify the app displays the expected result option

  Scenario: Verify users can search any folders from the search box.
    And users search any existing "Testing359" name
    Then verify the app displays the expected result option

  Scenario: Verify users can search any files from the search box.
    And users search any existing "user80" name
    Then verify the app displays the expected result option