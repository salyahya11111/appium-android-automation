package com.automation.tests;

import com.automation.pages.SignupPage;
import com.automation.pages.LoginPage;
import com.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test
    public void testSignupAndLogin() {
        HomePage homePage = new HomePage(driver);

        // Navigate to Signup page
        SignupPage signupPage = homePage.navigateToSignupScreen();
        signupPage.enterUsername("testuser");
        signupPage.enterEmail("testuser@example.com");
        signupPage.enterPassword("Test1234");
        signupPage.clickSignupButton();

        // Assert signup was successful (e.g., redirected to the home page)
        Assert.assertTrue(driver.getCurrentActivity().contains("WelcomePage"));

        // Navigate to Login page
        LoginPage loginPage = homePage.navigateToLoginScreen();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("Test1234");
        loginPage.clickLoginButton();

        // Assert login was successful
        Assert.assertTrue(driver.getCurrentActivity().contains("HomePage"));
    }
}
