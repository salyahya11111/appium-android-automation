package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class signUp{

    private AndroidDriver driver;

    // Locators
    private By signupButton = By.id("com.example:id/signup_button");
    private By usernameField = By.id("com.example:id/username");
    private By emailField = By.id("com.example:id/email");
    private By passwordField = By.id("com.example:id/password");

    public SignupPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignupButton() {
        return driver.findElement(signupButton);
    }

    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    // Actions
    public void enterUsername(String username) {
        getUsernameField().sendKeys(username);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void clickSignupButton() {
        getSignupButton().click();
    }
}
