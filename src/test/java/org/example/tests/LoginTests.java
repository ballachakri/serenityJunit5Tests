package org.example.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.example.hooks.Hooks;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTests extends Hooks {

    @Steps
    LoginPage loginPage;

    @Test
    @DisplayName("User login")
    public void userLogin()  {

        loginPage.clickMyAccountTab().clickLoginTab()
                        .enterEmail("email123@email.com").enterPassword("Auto123@")
                        .clickLoginButton();

        String account = loginPage.getAccountName();

        Assertions.assertThat(account).isEqualToIgnoringCase(account);
    }

}
