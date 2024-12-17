package com.saucedemo.tests;

/**
 * InventoryPage handles all functionalities of the product listing page,
 * such as selecting items and adding them to the cart.
 * 
 * @author @baba
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class InventoryPage extends BasePage{

	 @FindBy(className = "inventory_item")
	    private List<WebElement> items;

	    @FindBy(className = "inventory_item_price")
	    private List<WebElement> prices;

	    @FindBy(className = "btn_inventory")
	    private List<WebElement> addToCartButtons;

	    public InventoryPage(WebDriver driver) {
	        super(driver);
	    }
	    
	    /**
	     * This method identifies the highest-priced item on the page
	     * and adds it to the cart.
	     */

	    public void addHighestPricedItemToCart() {
	        double maxPrice = 0.0;
	        int maxPriceIndex = -1;

	        for (int i = 0; i < prices.size(); i++) {
	            double price = Double.parseDouble(prices.get(i).getText().replace("$", ""));
	            if (price > maxPrice) {
	                maxPrice = price;
	                maxPriceIndex = i;
	            }
	        }

	        addToCartButtons.get(maxPriceIndex).click();
	    }
}
