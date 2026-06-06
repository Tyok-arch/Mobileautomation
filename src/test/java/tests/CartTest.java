package tests;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductPage;
import pages.CartPage;
import utils.DriverFactory;

public class CartTest {

    @Test
    public void addProductToCart() throws Exception {

        AndroidDriver driver = DriverFactory.createDriver();

        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        try {

            System.out.println("App Started");

            Thread.sleep(5000);

            System.out.println("Open Product");
            productPage.openProduct();

            Thread.sleep(3000);

            System.out.println("Add To Cart");
            productPage.addToCart();

            Thread.sleep(2000);

            System.out.println("Open Cart");
            cartPage.openCart();

            Thread.sleep(3000);

            System.out.println("Verification");

            Assert.assertTrue(
                    driver.getPageSource().contains("My Cart")
            );

        } finally {

            driver.quit();
        }
    }
}