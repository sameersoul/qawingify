package com.wingify.tests;

import com.wingify.pages.homePage;
import com.wingify.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {
    private loginPage loginPage;
    private homePage homePage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        driver.get("https://sakshingp.github.io/assignment/login.html");
        loginPage = new loginPage(driver);
        homePage = new homePage(driver);
        loginPage.login("any_username", "any_password");
    }

    @Test
    public void testAmountSorting() throws InterruptedException {
        homePage.clickAmountHeader();

        List<Double> amounts = homePage.getAmounts();
        List<Double> sortedAmounts = homePage.getSortedAmounts();

        System.out.println("Original Amounts: " + amounts);
        System.out.println("Sorted Amounts: " + sortedAmounts);

        Assert.assertTrue(homePage.isSorted(amounts), "Amount values should be sorted after clicking the AMOUNT header");
    }
}
