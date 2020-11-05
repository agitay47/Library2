@different_users
Feature: User account tests
  As a user, I should be able to login with different users using their correct emails and passwords.
  when I login, I should be able to see username in the account username section.

  @all_accounts
  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"

#TEST DATA
    @students
    Examples:
      | email             | password |
      | student27@library | kkMksO2i |
      | student28@library | 19Ceq2sT |
      | student29@library | WyIUNpDI |
      | student30@library | IaT9YI0I |

    @librarians
    Examples:
      | email | password |
      | librarian13@library | 9rf6axdD |
      | librarian14@library | 87x8afWY |
      | librarian15@library | S5Ejblg1 |
      | librarian16@library | 8BzUhhaU |
      | librarian17@library | tXqOoIOS |