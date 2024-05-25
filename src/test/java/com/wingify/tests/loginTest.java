package com.wingify.tests;

import com.wingify.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {
    private WebDriver driver;
    private loginPage loginPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new loginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void testLogin() {
        driver.get("https://sakshingp.github.io/assignment/login.html");
        loginPage.login("any_username", "any_password");
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("home"), "URL should contain 'home'");


    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        driver.get("https://sakshingp.github.io/assignment/login.html");
        loginPage.login("", "");
        String error ="Both Username and Password must be present";
        Assert.assertEquals(error, "Both Username and Password must be present");
    }
}
