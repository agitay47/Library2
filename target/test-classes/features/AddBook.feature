@Books
Feature:Librarin should be able to login with valid credentials

  Background: Common Steps
    Given I am on the login page
    When librarian enter "username" and "password"

  @Add_book
  Scenario Outline: Add a new book as a Librarian
    And click on the "Books"
    And click on "Add Book"
    And add '<Book Name>'
    And include '<ISBN>' number
    Then put the '<Year>' came out
    And add '<Author>' name
    And choose "Drama" as a book category
    And add '<Description>' for Leylan
    Then user click to "Save Changes"
    Examples:
      | Book Name | ISBN | Year | Author              | Description             |
      | Leylan    | 1111 | 2020 | Selahattin Demirtas | Freedom for Selo Baskan |


  @Edit_book
  Scenario Outline:Edit a book as a Librarian
    And click on the "Books"
    Then click on the "Edit Book" button
    And add '<Book Name>'
    And include '<ISBN>' number
    Then put the '<Year>' came out
    And add '<Author>' name
    And choose "Drama" as a book category
    And add '<Description>' for Leylan
    Then user click to "Save Changes"

    Examples:
      | Book Name                 | ISBN | Year | Author      | Description             |
      | Siya Evînê Shadow of Love | 0001 | 1989 | Mehmed Uzun | Live for love |
