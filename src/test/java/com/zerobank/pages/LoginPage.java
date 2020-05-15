package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage() {

        PageFactory.initElements ( Driver.get (), this );
    }

    @FindBy(id="signin_button")
    public WebElement signButton;

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement submitButton;

    @FindBy(xpath="//h3[.='Troubles entering the site?']")
    public WebElement errormessage;

    public void login(String UserName, String Password) {
        signButton.click ();
        this.username.sendKeys ( UserName );
        this.password.sendKeys ( Password );
        submitButton.click ();

    }
}
