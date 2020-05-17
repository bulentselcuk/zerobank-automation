package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage extends BasePage {
    public TransactionPage() {
        PageFactory.initElements ( Driver.get (), this );
    }

    @FindBy(xpath="//a[.='Account Activity']")
    public WebElement AccountActivity;
    @FindBy(xpath="//a[.='Find Transactions']")
    public WebElement fT;
    @FindBy(id="aa_fromDate")
    public WebElement fromDate;
    @FindBy(id="aa_toDate")
    public WebElement toDate;
    @FindBy(css=".btn")
    public WebElement Find;
    @FindBy(xpath="//div[@id='filtered_transactions_for_account']//td[.='2012-09-06']")
    public WebElement verifyDate;

}