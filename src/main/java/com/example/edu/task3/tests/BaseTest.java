package com.example.edu.task3.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup () {
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
