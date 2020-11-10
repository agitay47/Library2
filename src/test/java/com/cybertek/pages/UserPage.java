package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BasePage {

    public UserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Users']")
    private WebElement users;

    @FindBy(xpath = "//select[@id='user_groups']")
    private WebElement groups;

    @FindBy(xpath = "(//select[@id='user_groups'])[1]")
    private WebElement librarian;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    private WebElement addUser;

    @FindBy(xpath = "//select[@name='user_group_id']//option[1]")
    private WebElement librarian2;

    @FindBy(xpath = "(//table[@id='tbl_users']//a[@role='button'])[1]")
    private WebElement editUser;

    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@name='address']")
    private WebElement address;

    @FindBy(xpath = "//button[.='Save changes']")
    private WebElement saveChanges;



    public void clickOnUsers(String user){
        BrowserUtils.clickOnElement(users);
    }

    public void clickOnUserGroups(String string){
        BrowserUtils.clickOnElement(groups);
        BrowserUtils.clickOnElement(librarian);

    }

    public void clickOnAddUser(String string){
        BrowserUtils.clickOnElement(addUser);
    }


    public void clickOnEditUser(String string){
        BrowserUtils.clickOnElement(editUser);
    }

    public void createFullName(String string){
        BrowserUtils.enterText(fullName,string);
    }

    public void createPassword(String string){
        BrowserUtils.enterText(password,string);
    }

    public void createEmail(String string){
        BrowserUtils.enterText(email,string);
    }

    public void clickOnUserGroup(String string){
        BrowserUtils.clickOnElement(librarian2);

    }


    public void createAddress(String string){
        BrowserUtils.enterText(address,string);
    }

    public void clickOnSaveChanges(String string){
        BrowserUtils.clickOnElement(saveChanges);
    }











}

