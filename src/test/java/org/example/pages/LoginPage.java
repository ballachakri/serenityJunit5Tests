package org.example.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;


public class LoginPage extends UIInteractionSteps {

    @Step("Click my account tab")
    public LoginPage clickMyAccountTab() {
        $(By.cssSelector("a[title='My Account']")).click();
        return this;
    }

    @Step("Click my loginTab")
    public LoginPage clickLoginTab() {
        $(By.linkText("Login")).click();
        return this;
    }

    @Step("Enter email '{0}'")
    public LoginPage enterEmail(String email) {
        $(By.cssSelector("input[name='email']")).sendKeys(email);
        return this;
    }

    @Step("Enter password '{0}'")
    public LoginPage enterPassword(String password) {
        $(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    @Step("Click login")
    public void clickLoginButton() {
        $(By.cssSelector("input[value='Login']")).click();
    }

    @Step("Return account name")
    public String getAccountName() {
        return $(By.cssSelector("#account-account > ul > li:nth-child(2) > a")).getText();

    }


}
