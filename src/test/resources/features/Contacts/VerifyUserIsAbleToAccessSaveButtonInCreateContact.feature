@issue:TC_019
@author-Ramya

Feature: Verify User is able to access save button

  Scenario Outline:Verify User is able to access save button
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And  User is able to select create contact
    Then User Enters required details
    And Click on Save button

    Examples:
      | Username | Password |
      | will     | will     |