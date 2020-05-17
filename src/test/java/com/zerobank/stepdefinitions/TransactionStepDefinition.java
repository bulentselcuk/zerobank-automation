package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.TransactionPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TransactionStepDefinition {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        String URL=ConfigurationReader.get ( "url" );
        Driver.get ().get ( URL );
        LoginPage loginPage=new LoginPage ();
        String User=ConfigurationReader.get ( "User" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( User, Pass );
        TransactionPage transactionPage=new TransactionPage ();
        transactionPage.AccountActivity.click ();
        transactionPage.fT.click ();
    }

    @When("user enters date range from {string} to {string} and clicks find button")
    public void user_enters_date_range_from_to_and_clicks_find_button(String string, String string2) {
        TransactionPage transactionPage=new TransactionPage ();
        transactionPage.fromDate.sendKeys ( "2012-09-01" );
        BrowserUtils.waitFor ( 2 );
        transactionPage.toDate.sendKeys ( "2012-09-06" );
        BrowserUtils.waitFor ( 2 );
        transactionPage.Find.click ();
        BrowserUtils.waitFor ( 2 );


    }

    @Then("results table should only show {string} date")
    public void results_table_should_only_show_date(String string) {
        TransactionPage transactionPage=new TransactionPage ();
        String actual = transactionPage.verifyDate.getText ();
        String expected = "2012-09-06";
        Assert.assertEquals ( actual,expected );

    }

}
