Feature:


  Scenario Outline: Verify login with valid credentials
    Given user on "http://qa3.trycloud.net/index.php/login?clear=1"
    When user use usernamame "<username>" and "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | User31   | Userpass123 |
      | User61   | Userpass123 |
      | User91   | Userpass123 |





