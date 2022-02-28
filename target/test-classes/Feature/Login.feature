Feature: Test login

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User click sign in link
    When User uses <emailName> and <psw>
    And User click sign in button
    Then User is redirected to home page

    Examples:
    | emailName | psw |
    | test | test |
