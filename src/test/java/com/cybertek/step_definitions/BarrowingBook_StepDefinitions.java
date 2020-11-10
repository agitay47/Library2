package com.cybertek.step_definitions;

import com.cybertek.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarrowingBook_StepDefinitions {

    BooksPage books = new BooksPage();

    @When("user navigate to Borrowing Books module")
    public void user_navigate_to_borrowing_books_module() {
        books.clickOnBorrowingBook();
    }

    @When("user click on return book button")
    public void user_click_on_return_book_button() {
        books.clickOnReturnBook();
    }

    @Then("user should see success message")
    public void user_should_see_success_message() {
        books.verifyMessage();
    }
}
