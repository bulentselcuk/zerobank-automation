package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage extends BasePage{
    public PayBillsPage(){
        PageFactory.initElements ( Driver.get (), this );
    }


}
