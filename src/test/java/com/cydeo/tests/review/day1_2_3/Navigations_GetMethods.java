package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations_GetMethods {

    public static void main(String[] args) throws InterruptedException {

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

        Thread.sleep(3000);

        //      // 4. Verify url contains "formations"
       if(driver.getCurrentUrl().contains("formations")){
           System.out.println("URL verifications passed!");
       }else{
           System.out.println("URL verifications failed!");
       }

        //      // 5. Navigate back, forward and refresh
              driver.navigate().back();
        Thread.sleep(3000);
              driver.navigate().forward();
        Thread.sleep(3000);
              driver.navigate().refresh();
        Thread.sleep(3000);

        //      // 6. Click on "Practice Site"
        driver.findElement(By.linkText("Practice Site")).click();

        //      // 7. Verify title is "Automation Testing Practice Website for UI and API"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing Practice Website for UI and API";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

    }
}
