package com.cydeo.tests.review.day10_11_12;

import com.cydeo.pages.WebDriverWaitPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitTest {

    WebDriverWaitPage webDriverWaitPage = new WebDriverWaitPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    Faker faker = new Faker();

    @Test
    public void web_drive_wait_test(){
        // TC: WebdriverWait practice
// 1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get(ConfigurationReader.getProperty("web.driver.wait.url"));

// 2. Click to start
       webDriverWaitPage.startBtn.click();

// 3. Wait until loading bar disappears
     //  wait.until(ExpectedConditions.invisibilityOf(webDriverWaitPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(webDriverWaitPage.loadingBar);

// 4. Assert username inputbox is displayed
        Assert.assertTrue(webDriverWaitPage.username.isDisplayed());

// 5. Enter username: tomsmith
       webDriverWaitPage.username.sendKeys("tomsmith");

// 6. Enter password: incorrectpassword
       webDriverWaitPage.password.sendKeys(faker.internet().password());

// 7. Click to Submit button
     webDriverWaitPage.submitBtn.click();

// 8. Assert “Your password is invalid!” text is displayed.
      Assert.assertTrue(webDriverWaitPage.errorMsg.isDisplayed());

    }
}
