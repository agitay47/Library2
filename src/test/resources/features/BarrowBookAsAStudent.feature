@R_B
Feature: Return book
  As a student user, I should be able to return books by clicking on return book button under the Borrowing Books module.

  Background: Common Steps
    Given I am on the login page
    When student enter "username" and "password"

  @return_book
  Scenario: Return Success Message Verification
    And user navigate to Borrowing Books module
    When user click on return book button
    Then user should see success message