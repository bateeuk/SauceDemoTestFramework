package com.saucedemo.tests;

/**
 * LoginTest validates the login functionality and ensures that
 * the highest-priced item can be added to the cart.
 * 
 * @author @baba
 */

import com.saucedemo.tests.InventoryPage;
import com.saucedemo.tests.LoginPage;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class LoginTest extends BaseTest{
	 @Test
	    public void testAddHighestPricedItemToCart() {
	        driver.get("https://www.saucedemo.com/");

	        // Step 1: Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        // Step 2: Add highest priced item to cart
	        InventoryPage inventoryPage = new InventoryPage(driver);
	        inventoryPage.addHighestPricedItemToCart();
	    }

}
