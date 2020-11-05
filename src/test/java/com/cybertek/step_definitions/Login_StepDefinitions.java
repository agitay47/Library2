package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get("http://library2.cybertekschool.com/");
    }

    @When("librarian enter {string} and {string}")
    public void librarian_enter_and(String string, String string2) {
        loginPage.createUsername(string);
        loginPage.createPassword(string2);
        loginPage.clickOnSignInButton();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//div[@id='navbarCollapse']//span[.='Dashboard']")).getText();

        Assert.assertEquals(actualTitle, actualTitle);
    }

    @When("student enter {string} and {string}")
    public void student_enter_and(String string, String string2) {
        loginPage.studentUsername(string);
        loginPage.studentPassword(string2);
        loginPage.clickOnSignInButton();
    }

    @Then("books should be displayed")
    public void books_should_be_displayed() {

        String expectedTitle = "Books";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//span[.='Books']")).getText();
        Assert.assertEquals(actualTitle, actualTitle);
    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {
        loginPage.createUsername(string);
        loginPage.createPassword(string2);
        loginPage.clickOnSignInButton();

    }

}
