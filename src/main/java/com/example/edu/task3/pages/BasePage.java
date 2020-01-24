package com.example.edu.task3.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public void click (By elementBy) {
        driver.findElement(elementBy).click();
    }

    public void assertEquals (By element, String expectedText) {
        Assert.assertEquals(getText(element), expectedText);
    }

    public String getText (By element) {
        return driver.findElement(element).getText();
    }

    public String getClass (By element){
        return driver.findElement(element).getClass().toString();
    }
}
