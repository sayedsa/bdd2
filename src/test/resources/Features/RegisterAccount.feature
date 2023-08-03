Feature: Register functionality using DataTable

  Background: 
    Given user test Register funtionality using data table

  @reg
  Scenario: Register an account in  test Environment page using DataTable
    When User clicks on MyAccount
    And user click on Register
    And user fills out the following information
      | FirstName | LastName | Email                  | Telephone  | Country | Password | ConfirmPassword |
      | Sayed     | Sadat    | sayed3@toptechschool.us | 2536529199 | US      | test123  | test123         |
    And user subscribes to newsletter
    And user  checks the Privacy Policy checkbox
    Then user clicks the Continue button
    And user is registerd and received the following message 'Your Account Has Been Created!'
