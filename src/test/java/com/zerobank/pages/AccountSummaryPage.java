package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage{
    public AccountSummaryPage(){
        PageFactory.initElements ( Driver.get (),this );

    }
    @FindBy (xpath="//h2[.='Cash Accounts']")
    public WebElement CashAccount;

    @FindBy (xpath="//h2[.='Investment Accounts']")
    public WebElement InvestmentAccount;

    @FindBy(xpath="//h2[.='Credit Accounts']")
    public WebElement CreditAccount;

    @FindBy(xpath="//h2[.='Loan Accounts']")
    public WebElement LoanAccount;

    @FindBy(xpath = "(//*[@class='table'])[3]//tr//th")
    public List<WebElement> CreditAccountTable;



}
