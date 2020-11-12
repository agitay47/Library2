package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends BasePage {

    public BooksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Books']")
    private WebElement books;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    private WebElement editBook;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    private WebElement addBook;

    @FindBy(name = "name")
    private WebElement bookName;

    @FindBy(name = "isbn")
    private WebElement ISBN;

    @FindBy(name = "year")
    private WebElement year;

    @FindBy(xpath = "(//*[@name='author'])[2]")
    private WebElement author;

    @FindBy(xpath = "(//*[.='Drama'])[1]")
    private WebElement drama;

    @FindBy(id = "description")
    private WebElement description;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    private WebElement borrowingBook;

    @FindBy(xpath = "(//*[@id='borrowed_list']//td[1])[14]")
    private WebElement returnBook;

    @FindBy(xpath = "//div[@id='toast-container']//div[@class='toast-message']")
    private WebElement message;

    public void clickOnBooks(String string) {
        BrowserUtils.clickOnElement(books);
    }

    public void clickOnEditBook(String string) {
        BrowserUtils.clickOnElement(editBook);
    }

    public void clickOnAddBook(String string) {
        BrowserUtils.clickOnElement(addBook);
    }

    public void addBookName(String string) {
        bookName.clear();
        BrowserUtils.enterText(bookName, string);
    }

    public void addISBN(String string) {
        BrowserUtils.enterText(ISBN, string);
    }

    public void addYear(String string) {
        year.clear();
        BrowserUtils.enterText(year, string);
    }

    public void addAuthor(String string) {
        author.clear();
        BrowserUtils.enterText(author, string);
    }

    public void clickOnDrama(String string) {
        BrowserUtils.clickOnElement(drama);
    }

    public void createDescription(String string) {
        description.clear();
        BrowserUtils.enterText(description, string);
    }

//    public void bookCategory(String string){
//        Select select = new Select(Driver.getDriver().findElement(By.id("book_group_id")));
//        select.selectByVisibleText("Drama");
//
//    }

    public void clickOnBorrowingBook() {

        BrowserUtils.clickOnElement(borrowingBook);
    }

    public void clickOnReturnBook() {

        BrowserUtils.clickOnElement(returnBook);
    }

    public void verifyMessage() {
        String expected = "The book has been returned..";
        String actual = Driver.getDriver().findElement(By.xpath("(//*[.='The book has been returned..'])[1]")).getText();

        BrowserUtils.waitForVisibility(By.xpath("//div[@class='toast toast-success']"), 20);

        Assert.assertEquals("Message is not matching", expected, actual);
    }


}
