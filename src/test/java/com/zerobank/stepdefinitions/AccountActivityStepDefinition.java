package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityStepDefinition extends BasePage {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String URL=ConfigurationReader.get ( "url" );
        Driver.get ().get ( URL );
        LoginPage loginPage=new LoginPage ();
        String User=ConfigurationReader.get ( "User" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( User, Pass );

    }

    @When("the user clicks on Savings link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        AccountActivityPage accountActivityPage = new AccountActivityPage ();
        accountActivityPage.Saving.click ();
    }

    @When("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select selectList =new Select(accountActivityPage.dropDown);
        String actual=selectList.getFirstSelectedOption().getText();
        Assert.assertEquals("verify that","Savings",actual);
    }

    @When("the user clicks on Brokerage link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Checking link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Credit card link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks on Loan link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
