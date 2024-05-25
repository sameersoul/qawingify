package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends BasePage {

  

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("log-in");
    private By error = By.xpath("//div[@id='random_id_8']");

    

    public void login(String username, String password) {
       driver.findElement(usernameField).sendKeys(username);
       driver.findElement(passwordField).sendKeys(password);
       driver.findElement(loginButton).click();;
    }
    public WebElement ErrorMessage() {
    	 return driver.findElement(error) ;
    }
	
}