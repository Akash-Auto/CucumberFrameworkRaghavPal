Feature: Test Login Functionality

  Scenario Outline: Test Login Functionality with multiple credentials
    Given Open the browser
    When user enter <username> and <password>
    Then User is navigated to homepage

    Examples: 
      |    | password     |
      | student  | Password123  |
      | student1 | Password1234 | 