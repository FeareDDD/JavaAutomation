package com.example.edu.task3.tests;

import com.example.edu.task3.pages.HomePage;
import org.testng.annotations.Test;


public class CategoryStateTest extends BaseTest{
    @Test
    public void VerifyCategoryIsSelected () {
        HomePage homepage = new HomePage(driver);

        homepage.openHomePage().verifyCategoryIsSelected("Hot");
    }
}
