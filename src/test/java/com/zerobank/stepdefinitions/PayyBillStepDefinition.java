package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayyBillStepDefinition {

    @When("The user navigate to {string} module")
    public void the_user_navigate_to_module(String string) throws InterruptedException {
        LoginPage loginPage = new LoginPage ();
        loginPage.navigate ( "Pay Bills" );

    }

    @Then("Account activity page should have the title {string}")
    public void account_activity_page_should_have_the_title(String string) {
        LoginPage loginPage = new LoginPage();
        PayBillsPage payBillsPage = new PayBillsPage ();
        String expected = "Zero - Pay Bills";
        String actual = payBillsPage.Payment.getText ();

    }
}
