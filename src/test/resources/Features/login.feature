Feature: Login functionality

  @test1
  Scenario: I want to login to my Account
    Given the user is on the homepage
    When user clicks on MyAccount
    And user click on login
    And user enters 'sadatsayedibrahim@gmail.com'  and 'test123'
    And user clicks login button
    Then user is navigated to the login page
    Then user logs out of account

  @test2
  Scenario Outline: I want to login to my Account
    Given the user is on the homepage
    When user clicks on MyAccount
    And user click on login
    And user enters '<email>'  and '<password>'
    And user clicks login button
    Then user is navigated to the login page

    Examples: 
      | email                        | password |
      | sadatsayedibrahim@gmail.com  | test123  |
      | sayed.sadatibrahim@gmail.com | test123  |
