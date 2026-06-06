package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    public void openProduct() {

        System.out.println("Klik Produk");

        driver.findElements(
                By.id("com.saucelabs.mydemoapp.android:id/productIV")
        ).get(0).click();
    }

    public void addToCart() {

        System.out.println("Klik Add To Cart");

        driver.findElement(
                AppiumBy.accessibilityId("Tap to add product to cart")
        ).click();
    }
}