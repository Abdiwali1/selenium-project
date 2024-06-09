package com.cydeo.tests.review.day4_5_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationFormPage {

    @Test
    public void registration_form_page_title(){

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/registration_form
         driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        Assert.assertEquals(actualTitle,expectedTitle,"Title verification is failed!");

    //    Assert.assertTrue(actualTitle.equals(expectedTitle),"Title verification is failed!");


    }
}
