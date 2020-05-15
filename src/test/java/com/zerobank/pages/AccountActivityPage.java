package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage extends BasePage{
    public AccountActivityPage(){
        PageFactory.initElements ( Driver.get (), this );
    }
    

}
