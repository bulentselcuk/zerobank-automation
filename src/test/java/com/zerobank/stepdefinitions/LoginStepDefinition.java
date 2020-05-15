package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String URL=ConfigurationReader.get ( "url" );
        Driver.get ().get ( URL );
    }
    @When("The user enter the valid credential")
    public void the_user_enter_the_valid_credential() {
        LoginPage loginPage=new LoginPage ();
        String User=ConfigurationReader.get ( "User" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( User, Pass );
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle=Driver.get ().getTitle ();
        String expectedTitle="Zero - Account Summary";
        Assert.assertEquals ( "Verify", expectedTitle, actualTitle );
        BrowserUtils.waitFor (3);
    }



    @When("The user enter the invalid credential")
    public void the_user_enter_the_invalid_credential() {
        LoginPage loginPage=new LoginPage ();
        String InvalidUser=ConfigurationReader.get ( "InvalidUser" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( InvalidUser, Pass );
    }

    @Then("The user should see error message{string}")
    public void the_user_should_see_error_message(String string) {
        LoginPage loginPage=new LoginPage ();
        String actualMessage=loginPage.errormessage.getText ();
        String expectedMessage="Troubles entering the site?";
        Assert.assertEquals ( expectedMessage, actualMessage );
    }

    @When("The user enter the blank username")
    public void the_user_enter_the_blank_username() {
        LoginPage loginPage=new LoginPage ();
        String userNameBlank=ConfigurationReader.get ( "userNameBlank" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( userNameBlank, Pass );
        String actualMessage=loginPage.errormessage.getText ();
        String expectedMessage="Troubles entering the site?";
        Assert.assertEquals ( expectedMessage, actualMessage );
    }

    @When("The user enter the blank password")
    public void the_user_enter_the_blank_password() {
        LoginPage loginPage=new LoginPage();
        String User=ConfigurationReader.get("User");
        String passwordBlank=ConfigurationReader.get("passwordBlank");
        loginPage.login(User,passwordBlank);
        String actualMessage=loginPage.errormessage.getText ();
        String expectedMessage="Troubles entering the site?";
        Assert.assertEquals ( expectedMessage, actualMessage );
    }
}
