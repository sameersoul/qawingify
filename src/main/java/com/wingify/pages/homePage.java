package com.wingify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class homePage {
    private WebDriver driver;

    // Locators
    private By amountHeader = By.xpath("//th[contains(text(), 'Amount')]");
    private By amountCells = By.xpath("//td[@class='text-right bolder nowrap']/span");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAmountHeader() throws InterruptedException {
        driver.findElement(amountHeader).click();
        Thread.sleep(5000);
        driver.findElement(amountHeader).click();
    }

    public List<Double> getAmounts() {
        List<WebElement> amountElements = driver.findElements(amountCells);
        List<Double> amounts = new ArrayList<>();

        for (WebElement element : amountElements) {
            String amountText = element.getText().replace(",", "").replace(" USD", "").trim();
            double amount = Double.parseDouble(amountText.startsWith("+") || amountText.startsWith("-") ? amountText.substring(1) : amountText);
            amounts.add(amountText.startsWith("-") ? -amount : amount);
        }
        return amounts;
    }

    public List<Double> getSortedAmounts() {
        List<Double> amounts = getAmounts();
        Collections.sort(amounts);
        return amounts;
    }

    public boolean isSorted(List<Double> list) {
        if (list.size() <= 1) return true;
        List<Double> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        if (list.equals(sortedList)) return true;

        Collections.sort(sortedList, Collections.reverseOrder());
        return list.equals(sortedList);
    }
}
