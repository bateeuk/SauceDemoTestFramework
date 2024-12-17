package com.saucedemo.tests;

/**
 * LoginPage handles all the interactions and functionalities
 * related to the login page of the SauceDemo website.
 * 
 * @author @baba
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	 @FindBy(id = "user-name")
	    private WebElement usernameInput;

	    @FindBy(id = "password")
	    private WebElement passwordInput;

	    @FindBy(id = "login-button")
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        super(driver);
	    }

	    public void login(String username, String password) {
	        usernameInput.sendKeys(username);
	        passwordInput.sendKeys(password);
	        loginButton.click();
	    }

}
