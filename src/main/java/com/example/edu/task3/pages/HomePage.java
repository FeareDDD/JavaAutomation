package com.example.edu.task3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage (){
        driver.get("https://9gag.com/");
        return this;
    }

    public HomePage verifyCategoryIsSelected (String categoryName) {
        By categoryHot = By.xpath(String.format("//a[normalize-space(text())='%s']", categoryName));
        assertEquals(categoryHot, "selected");
        return this;
    }
}
