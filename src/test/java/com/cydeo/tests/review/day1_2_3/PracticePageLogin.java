package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePageLogin {

    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        driver.findElement(By.name("username")).sendKeys("tomsmith");

        // 4. Enter password: "SuperSecretPassword"
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        // 5. Click to Login button
        driver.findElement(By.id("wooden_spoon")).click();

        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"
        WebElement resultText = driver.findElement(By.xpath("//div[@id='flash']"));
        WebElement resultText2 = driver.findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));
        WebElement resultText3 = driver.findElement(By.xpath("//div[@class='flash success']"));
        WebElement resultText4 = driver.findElement(By.cssSelector("div#flash"));
        WebElement resultText5 = driver.findElement(By.cssSelector("div.flash.success"));

        String actualText = resultText.getText();
        String expectedText = "You logged into a secure area!";

        if(actualText.contains(expectedText)){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!");
        }


    }
}
