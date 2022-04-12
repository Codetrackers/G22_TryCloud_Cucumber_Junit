
Feature: As a user, I should be able to remove files from the favorites and upload a file directly

  Scenario Outline: Verify users can add the folder

   Given user on the dashboard page with "<username>" and "<password>"
   When user clicks the "Files" module
    And user clicks the add icon on the top
    And user click new folder
    And user write a "<folderName>"
    When user click submit icon
    Then Verify the "<folderName>" is displayed on the page

    Examples:
      | username | password    | folderName |
      | User31   | Userpass123 |  user11    |
      | User61   | Userpass123 |   user22   |
      | User91   | Userpass123 |   user33   |


  Scenario Outline:  Verify users can upload a file inside a folder

    Given user on the dashboard page with "<username>" and "<password>"
    When user clicks the "Files" module
    And user clicks the add icon on the top
    When user uploads "<fileName>" with the upload file option
    Then Verifies the "<fileName>" is displayed on the page

    Examples:
      | username | password    | fileName |
      | User31   | Userpass123 |  C:\Users\shtuy\OneDrive\Pictures\Screenshots\Discord.png   |
    #  | User61   | Userpass123 |   C:\Users\shtuy\OneDrive\Pictures\Screenshots\IDandClassAttributes.png   |
     # | User91   | Userpass123 |   C:\Users\shtuy\OneDrive\Pictures\Screenshots\Cucumber_2_Layers.png   |