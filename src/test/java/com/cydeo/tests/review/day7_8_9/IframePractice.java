package com.cydeo.tests.review.day7_8_9;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class IframePractice extends TestBase {

    @Test
    public void iframe_test(){
        // 1. Users are already login and on the homepage of CRM app
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver);

        // 2. Users click the MESSAGE tab
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();

        // 3. Users write test message
     //   driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));

        driver.findElement(By.tagName("body")).sendKeys("whatever");

        // 4. Users click the SEND button
        driver.switchTo().defaultContent(); // If you want to go back to main HTML
    //    driver.switchTo().parentFrame(); // If iframe is nested child iframe and you want to go back to parent iframe

        driver.findElement(By.id("blog-submit-button-save")).click();

        // 5. Verify the message is displayed on the feed
    //    WebElement feedMsg = driver.findElement(By.className("feed-post-text-block-inner-inner"));
        WebElement feedMsg2 = driver.findElement(By.xpath("//div[contains(@id,'blog_post_body_')]"));

        Assert.assertEquals(feedMsg2.getText(),"whatever");

    }

}
