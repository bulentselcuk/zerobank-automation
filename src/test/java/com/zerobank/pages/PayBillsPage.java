package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PayBillsPage extends BasePage {
    public PayBillsPage() {
        PageFactory.initElements ( Driver.get (), this );
    }

    @FindBy(xpath="//a[.='Pay Bills']")
    public WebElement PayBill;
    @FindBy(xpath="//div[@class='top_offset']/div[@class='row']/div[contains(.,'×')]")
    public WebElement Payment;
    @FindBy(xpath="//a[.='Add New Payee']")
    public WebElement newPay;
    @FindBy(id="add_new_payee")
    public WebElement addPay;
    @FindBy(id="np_new_payee_name")
    public WebElement payName;
    @FindBy(id="np_new_payee_address")
    public WebElement payAdress;
    @FindBy(id="np_new_payee_account")
    public WebElement payAccount;
    @FindBy(id="np_new_payee_details")
    public WebElement payDetails;
    @FindBy(id="alert_content")
    public WebElement alert;

    public void addNewPayee(String name, String address, String account, String paydetails) {
        payName.sendKeys ( name );
        payAdress.sendKeys ( address );
        payAccount.sendKeys ( account );
        payDetails.sendKeys ( paydetails );
        addPay.click ();

    }


}
