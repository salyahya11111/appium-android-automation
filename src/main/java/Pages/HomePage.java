package com.automation.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver driver;

    // Locators for elements on the home screen
    private By signupTab = By.id("com.example:id/signup_tab");
    private By loginTab = By.id("com.example:id/login_tab");
    private By formsTab = By.id("com.example:id/forms_tab");
    private By swipeTab = By.id("com.example:id/swipe_tab");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Navigate to the Login screen
    public LoginPage navigateToLoginScreen() {
        driver.findElement(loginTab).click();
        return new LoginPage(driver);
    }

    // Navigate to the Signup screen
    public SignupPage navigateToSignupScreen() {
        driver.findElement(signupTab).click();
        return new SignupPage(driver);
    }

    // Navigate to the Forms screen
    public void navigateToFormsScreen() {
        driver.findElement(formsTab).click();
    }

    // Navigate to the Swipe screen
    public void navigateToSwipeScreen() {
        driver.findElement(swipeTab).click();
    }
}
