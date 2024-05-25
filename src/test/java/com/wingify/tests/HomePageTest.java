package com.wingify.tests;

import com.wingify.pages.homePage;
import com.wingify.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest {
    private WebDriver driver;
    private loginPage loginPage;
    private homePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Perform login
        driver.get("https://sakshingp.github.io/assignment/login.html");
        loginPage = new loginPage(driver);
        loginPage.login("any_username", "any_password");

        // Initialize the home page
        homePage = new homePage(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testAmountSorting() {
        // Click on the Amount header to sort the amounts
        homePage.clickAmountHeader();

        // Get the list of amounts and check if it is sorted
        List<Double> amounts = homePage.getAmounts();
        Assert.assertTrue(homePage.isSorted(amounts), "Amount values should be sorted after clicking the AMOUNT header");
    }
}
