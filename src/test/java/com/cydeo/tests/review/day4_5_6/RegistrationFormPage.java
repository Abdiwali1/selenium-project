package com.cydeo.tests.review.day4_5_6;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationFormPage {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void registration_form_page_title(){

        // 1. Open Chrome browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/registration_form
         driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        Assert.assertEquals(actualTitle,expectedTitle,"Title verification is failed!");

    //    Assert.assertTrue(actualTitle.equals(expectedTitle),"Title verification is failed!");

    }

    @Test
    public void registration_form_filling_out_test(){
        // 1. Open Chrome browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/registration_form
         driver.get("https://practice.cydeo.com/registration_form");

        // 3. Enter First name: "John"
        driver.findElement(By.name("firstname")).sendKeys("John");

        // 4. Enter Last name: "Smith"
        driver.findElement(By.name("lastname")).sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        driver.findElement(By.cssSelector("input[placeholder='email@email.com']")).sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"
        // 8. Enter Phone number: "123-456-7890"


        // 9. Click to "Male" from Gender
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='male']"));
        maleBtn.click();
        Assert.assertTrue(maleBtn.isSelected(),"Male button is not selected!");

        // 10. Enter Date of birth "01/28/1990"


        // 11. Select "Department of Engineering" from Department/Office dropdown
        // 12. Select "SDET" from Job title dropdown
        // 13. Click to "Java" from languages
        // 14. Click to "Sign up" button
        // 15. Verify text displayed on page
        //     Expected: "Well done!"


    }

    @AfterMethod
    public void teardown(){
     //   driver.quit();
    }
}
