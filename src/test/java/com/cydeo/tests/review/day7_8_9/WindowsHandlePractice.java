package com.cydeo.tests.review.day7_8_9;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandlePractice extends TestBase {

    @Test
    public void windows_handle_test(){
        //    1. Open browser
        //    2. Go to website: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        //    3. Click on New Tab button
        driver.findElement(By.id("tabButton")).click();

        //    4. Click on New Window button
        driver.findElement(By.id("windowButton")).click();

        //    5. Click on New Window Message button
        driver.findElement(By.id("messageWindowButton")).click();

        //    6. Print out each window title
       Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            System.out.println("eachWindow = " + eachWindow);
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }



    }
}
