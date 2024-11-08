package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login {

    private final AndroidDriver driver;

    // Locators
    private final By loginButton = By.id("com.example:id/login_button");
    private final By usernameField = By.id("com.example:id/username");
    private final By passwordField = By.id("com.example:id/password");

    public login(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    // Actions
    public void enterUsername(String username) {
        getUsernameField().sendKeys(username);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }
}
