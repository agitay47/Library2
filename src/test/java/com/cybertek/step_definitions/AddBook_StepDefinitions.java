package com.cybertek.step_definitions;

import com.cybertek.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBook_StepDefinitions {

    BooksPage booksPage = new BooksPage();

    @When("click on the {string}")
    public void click_on_the(String string) {
        booksPage.clickOnBooks(string);
    }

    @Then("click on the {string} button")
    public void click_on_the_button(String string) {
        booksPage.clickOnEditBook(string);
    }


    @When("click on {string}")
    public void click_on(String string) {

        booksPage.clickOnAddBook(string);
    }

    @When("add {string}")
    public void add(String BookName) {

        booksPage.addBookName(BookName);
    }

    @When("include {string} number")
    public void unclude_number(String string) {

        booksPage.addISBN(string);
    }

    @Then("put the {string} came out")
    public void put_the_came_out(String string) {

        booksPage.addYear(string);
    }

    @Then("add {string} name")
    public void name(String string) {

        booksPage.addAuthor(string);
    }

    @Then("choose {string} as a book category")
    public void choose_as_a_book_category(String string) {

        booksPage.clickOnDrama(string);
    }

    @Then("add {string} for Leylan")
    public void add_for_leylan(String string) {

        booksPage.createDescription(string);
    }

}
