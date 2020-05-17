package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.pages.TransactionPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDefinition {

    PayBillsPage payBillsPage = new PayBillsPage ();

    @Given("user is already on Add New Payee page")
    public void user_is_already_on_Add_New_Payee_page() {
        String URL=ConfigurationReader.get ( "url" );
        Driver.get ().get ( URL );
        LoginPage loginPage=new LoginPage ();
        String User=ConfigurationReader.get ( "User" );
        String Pass=ConfigurationReader.get ( "Pass" );
        loginPage.login ( User, Pass );
        TransactionPage transactionPage=new TransactionPage ();
        transactionPage.AccountActivity.click ();
        transactionPage.fT.click ();
        payBillsPage.PayBill.click ();
        payBillsPage.newPay.click ();

    }

    @When("user creates new payee using following information")
    public void user_creates_new_payee_using_following_information(Map<String,String> dataTable) {
        payBillsPage.addNewPayee (dataTable.get("Payee Name"), dataTable.get("Payee Address"), dataTable.get("Account"), dataTable.get("Payee details"));
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
//        PayBillsPage payBillsPage = new PayBillsPage ();
        BrowserUtils.waitFor ( 3 );
        String actual = payBillsPage.alert.getText ();
        String expected ="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals (expected, actual);


    }

}
