package com.cybertek.step_definitions;

import com.cybertek.pages.UserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserEdit_StepDefinitions {

    UserPage userPage = new UserPage();

    @When("user click on {string} button")
    public void user_click_on_button(String users) {
        userPage.clickOnUsers(users);
    }

    @When("user choose group as a {string}")
    public void user_choose_group_as_a(String userGroups) {
        userPage.clickOnUserGroups(userGroups);
    }

    @When("user should be able to click on {string} button")
    public void user_should_be_able_to_click_on_button(String adduser) {
        userPage.clickOnAddUser(adduser);
    }


    @Then("user click on {string}")
    public void user_click_on(String edituser) {
        userPage.clickOnEditUser(edituser);
    }

    @Then("user add new {string}")
    public void user_add_new(String FullName) {
        userPage.createFullName(FullName);
    }

    @Then("user add a new {string}")
    public void user_add_a_new(String Password) {
        userPage.createPassword(Password);
    }

    @Then("user change {string}")
    public void user_change(String Email) {
        userPage.createEmail(Email);
    }

    @When("user choose group as {string}")
    public void user_choose_group_as(String userGroup) {
        userPage.clickOnUserGroup(userGroup);
    }

    @Then("user adding a new {string}")
    public void user_adding_a_new(String Address) {
        userPage.createAddress(Address);
    }

    @Then("user click to {string}")
    public void user_click_to(String string) {
      userPage.clickOnSaveChanges(string);
    }



}
