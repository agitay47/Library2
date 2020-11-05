@Users
Feature:Edit User


  Background: Common Steps
    Given I am on the login page
    When librarian enter "username" and "password"
    And user click on "Users" button
    And user choose group as a "Librarian"

  @Edit_user
  Scenario Outline: Librarian should be able to edit user with a new user
    Then user click on "Edit User"
    And user add new '<Full Name>'
    And user add a new '<Password>'
    Then user change '<Email>'
    And user choose group as "Librarian"
    Then user adding a new '<Address>'
    Then user click to "Save Changes"

    Examples:
      | Full Name | Password | Email        | Address     |
      | Agit AY   | 12345    | aa@gmail.com | Los Angeles |

  @AddUser
  Scenario Outline: Add a new Librarian
    And user should be able to click on "Add User" button
    And user add new '<Full Name>'
    And user add a new '<Password>'
    Then user change '<Email>'
    And user choose group as "Librarian"
    Then user adding a new '<Address>'
    Then user click to "Save Changes"


    Examples:
      | Full Name    | Password | Email             | Address |
      | Egid Merdini | 474747   | kurdish@gmail.com | Mardin  |


