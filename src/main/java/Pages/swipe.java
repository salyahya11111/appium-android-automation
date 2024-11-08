package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class swipe {

    private AndroidDriver driver;
    private By supportVideosCard = By.id("com.example:id/support_videos_card");

    public swipe(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getSupportVideosCard() {
        return driver.findElement(supportVideosCard);
    }

    // Swipe action until SUPPORT VIDEOS card appears
    public void swipeUntilCardVisible() {
        while (!getSupportVideosCard().isDisplayed()) {
            driver.swipe(100, 1000, 100, 200, 1000); // Example swipe action
        }
    }
    @Test(dataProvider = "getSignupData")
    public void testSignup(String username, String email, String password) {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.enterUsername(username);
        signupPage.enterEmail(email);
        signupPage.enterPassword(password);
        signupPage.clickSignupButton();

        // Assert
        Assert.assertTrue(driver.getCurrentActivity().contains("WelcomePage"));
    }

}
