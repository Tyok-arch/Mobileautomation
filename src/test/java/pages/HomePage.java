package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickBackpack() {

        driver.findElement(
                AppiumBy.accessibilityId("Sauce Labs Backpack")
        ).click();
    }
}