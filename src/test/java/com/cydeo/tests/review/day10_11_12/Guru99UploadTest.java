package com.cydeo.tests.review.day10_11_12;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99UploadTest extends TestBase {

    @Test
    public void guru99_upload_test(){
        // TC: Guru99 Upload Test
        //1. Go to  “https://demo.guru99.com/test/upload”
        driver.get("https://demo.guru99.com/test/upload");

        //2. Upload file into Choose File
        WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("/Users/aysundamar/Desktop/Cydeo.txt");

        //3. Click terms of service check box
        driver.findElement(By.name("terms")).click();

        //4. Click Submit File button
        driver.findElement(By.cssSelector("button#submitbutton")).click();

        //5. Verify expected message appeared.
        // Expected: “1 file
        // has been successfully uploaded.
        WebElement resultText = driver.findElement(By.cssSelector("h3[id='res']>center"));

        String expectedText = "1 file has been successfully uploaded.";
        String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed());


    }
}
