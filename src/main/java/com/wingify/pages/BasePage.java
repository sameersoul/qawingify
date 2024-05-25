package com.wingify.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        findElement(locator).click();
    }

    protected void type(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return findElement(locator).getText();
    }

    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }
}

