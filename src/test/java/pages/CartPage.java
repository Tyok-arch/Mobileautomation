package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CartPage extends BasePage {

    public CartPage(AndroidDriver driver) {
        super(driver);
    }

    public void openCart() {

        System.out.println("Klik Cart");

        driver.findElement(
                AppiumBy.accessibilityId("Displays number of items in your cart")
        ).click();
    }

    public boolean isCartDisplayed() {

        return driver.getPageSource().contains("My Cart");
    }
}