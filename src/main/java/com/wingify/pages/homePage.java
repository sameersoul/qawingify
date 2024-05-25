package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class homePage {
    private WebDriver driver;

    // Locator for the Amount column header
    private By amountHeader = By.xpath("//th[contains(text(), 'AMOUNT')]");
    // Locator for the Amount cells
    private By amountCells = By.xpath("//td[contains(@class, 'text-right') and contains(text(), ' USD')]");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAmountHeader() {
        driver.findElement(amountHeader).click();
    }

    public List<Double> getAmounts() {
        List<WebElement> amountElements = driver.findElements(amountCells);
        List<Double> amounts = new ArrayList<>();

        for (WebElement element : amountElements) {
            String amountText = element.getText().replace(" USD", "").replace(",", "").trim();
            amounts.add(Double.parseDouble(amountText));
        }
        return amounts;
    }

    public boolean isSorted(List<Double> list) {
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
