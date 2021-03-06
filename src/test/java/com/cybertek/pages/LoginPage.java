package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    private WebElement negativeMessage;


    public void createUsername(String string) {
        usernameInput.clear();
        BrowserUtils.enterText(usernameInput, ConfigurationReader.getProperty("LibrarianUsername"));
    }

    public void createPassword(String string) {
        passwordInput.clear();
        BrowserUtils.enterText(passwordInput, ConfigurationReader.getProperty("LibrarianPassword"));
    }

    public void clickOnSignInButton() {
        BrowserUtils.clickOnElement(signInButton);
    }

    public void studentUsername(String string) {
        BrowserUtils.enterText(usernameInput, ConfigurationReader.getProperty("StudentUsername"));
    }

    public void studentPassword(String string) {
        BrowserUtils.enterText(passwordInput, ConfigurationReader.getProperty("StudentPassword"));
    }

    public void negativeMessageDisplayed(String string) {
        String expected = "Sorry, Wrong Email or Password";
        String actual = negativeMessage.getText();

        Assert.assertEquals(expected, actual);
    }


}
