Feature:As a user, I should be able to log in.

  Scenario Outline: Verify user login fail with invalid credentials
    Given user on "http://qa3.trycloud.net/index.php/login?clear=1"

    When user uses invalid "<username>" and "<password>"

    And user click the login button

    Then verify "<message>" is displayed

    Examples:
      |username   | password    |message|
      | User9     | Wrong       |Wrong username or password.|
      | Wrong     | Userpass123 |Wrong username or password.|
      | Wrong     | Wrong       |Wrong username or password.|
