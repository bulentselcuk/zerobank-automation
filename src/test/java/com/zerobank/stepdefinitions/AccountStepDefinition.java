package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AccountStepDefinition {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String URL=ConfigurationReader.get ( "url" );
        Driver.get ().get ( URL );
    }

    @When("user enter the valid credential")
    public void user_enter_the_valid_credential() {
        LoginPage loginPage=new LoginPage ();
        String User=ConfigurationReader.get ( "User" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( User, Pass );
    }

    @Then("Account Summary page should have the title{string}")
    public void account_Summary_page_should_have_the_title(String string) {
        String actualTitle= Driver.get().getTitle();
        String expectedTitle=string;
        Assert.assertEquals("Verify",expectedTitle,actualTitle);
    }

    @Then("Account summary page should have Cash Account")
    public void account_summary_page_should_have_Cash_Account() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage ();
        String actual = accountSummaryPage.CashAccount.getText ();
        String expected = "Cash Accounts";
        Assert.assertEquals ( "Verify", "Cash Accounts",actual );

    }

    @Then("Account summary page should have Investment Account")
    public void account_summary_page_should_have_Investment_Account() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage ();
        String actual = accountSummaryPage.InvestmentAccount.getText ();
        String expected = "Investment Accounts";
        Assert.assertEquals ( "Verify", "Investment Accounts", actual );
    }

    @Then("Account summary page should have Credit Account")
    public void account_summary_page_should_have_Credit_Account() {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage ();
        String actual = accountSummaryPage.CreditAccount.getText ();
        String expected = "Credit Account";
        Assert.assertEquals ( "Verify", "Credit Accounts", actual );
    }

    @Then("Account summary page should have Loan Account")
    public void account_summary_page_should_have_Loan_Account() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage ();
        String actual = accountSummaryPage.LoanAccount.getText ();
        String expected = "Loan Accounts";
        Assert.assertEquals ( "Verify", "Loan Accounts", actual );

    }

    @Then("table must have columns {string}, {string} and {string}")
    public void table_must_have_columns_and(String string, String string2, String string3) {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage ();
        List<String> tableText = BrowserUtils.getElementsText(accountSummaryPage.CreditAccountTable);


        List<String> expectedList= new ArrayList<>();
        expectedList.add(string);
        expectedList.add(string2);
        expectedList.add(string3);
        Assert.assertTrue("Verify",expectedList.equals(tableText));
    }
}
