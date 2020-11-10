package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement signInButton;


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

    public void studentUsername(String string){
        BrowserUtils.enterText(usernameInput,ConfigurationReader.getProperty("StudentUsername"));
    }

    public void studentPassword(String string){
        BrowserUtils.enterText(passwordInput,ConfigurationReader.getProperty("StudentPassword"));
    }




}
