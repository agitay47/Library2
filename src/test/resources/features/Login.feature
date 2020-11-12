@smoke
Feature: Login feature

  Background: Common Steps
    Given I am on the login page

  @librarian
  Scenario: Login as a librarian
    When librarian enter "username" and "password"
    Then dashboard should be displayed

  @student
  Scenario: Login as a student
    When student enter "username" and "password"
    Then books should be displayed


  @negative_scenario_outline
  Scenario Outline: Invalid login with <user> and <password>
    When user logs in with "<user>" username and "<password>" password
    Then user verifies that "<message>" message is displayed

    Examples: data set
      | user             | password | message                        |
      | wrong@library    | bad      | Sorry, Wrong Email or Password |
      | wrong213@com     | bad      | Sorry, Wrong Email or Password |
      | wrong32@cybertek | bad      | Sorry, Wrong Email or Password |
      | wrong12@library  | bad      | Sorry, Wrong Email or Password |




