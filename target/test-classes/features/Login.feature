@login
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




