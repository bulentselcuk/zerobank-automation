package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage extends BasePage{
    public AccountActivityPage(){
        PageFactory.initElements ( Driver.get (), this );
    }
    @FindBy(xpath="//div[@class='offset2 span8']//tr[2]//a[.='Savings']")
    public WebElement Saving;

    @FindBy(xpath="//a[.='Brokerage']")
    public WebElement Brokerage;

    @FindBy(xpath="//a[.='Checking']")
    public WebElement Checking;

    @FindBy(xpath="//a[.='Credit Card']")
    public WebElement CreditCard;

    @FindBy(xpath="//a[.='Loan']")
    public WebElement Loan;

    @FindBy(id = "aa_accountId")
    public WebElement dropDown;

}
