package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations_GetMethods {

    public static void main(String[] args) {

        //// TC#1: Navigations and Get methods Practice
        //
        //      // 1. Open a chrome browser

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //      // 2. Go to: https://practice.expandtesting.com/

        driver.get("https://practice.expandtesting.com/");

        //      // 3. Click on "Automation Training"

//        WebElement automationTrainingBtn = driver.findElement(By.linkText("Automation Training"));
//        automationTrainingBtn.click();

        driver.findElement(By.linkText("Automation Training")).click();

        //      // 4. Verify url contains "formations"
       if(driver.getCurrentUrl().contains("formations")){
           System.out.println("URL verifications passed!");
       }else{
           System.out.println("URL verifications failed!");
       }

        //      // 5. Navigate back, forward and refresh


        //      // 6. Click on "Practice Site"


        //      // 7. Verify title is "Automation Testing Practice Website for UI and API"

    }
}
