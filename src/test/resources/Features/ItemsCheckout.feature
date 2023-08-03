Feature: Items checkout functionality

  Background: Given user is on test environment
@checkout
  Scenario: Checkout items from cart
    When user clicking on My Account
    And user clicking on loginBttn
    And user entering 'sadatsayedibrahim@gmail.com'  and 'test123'
    And user clicking login button
    And user clicking on Cameras
    And user clicking on Sony
    And user selecting one item from list
    And user  clicking Items button
    Then user checking out items
    And user  filling out the following information
      | FirstName | LastName | Country | Street         | City    | State | ZipCode | Phone      |
      | Sayed     | Sadat    | USA     | First st Ave S | Seattle | WA    |   98168 | 2536529199 |
    Then user places order
    And user clicking MyAccount at the bottom of the page
    Then user loggin out the account
