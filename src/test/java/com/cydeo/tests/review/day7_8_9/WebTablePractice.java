package com.cydeo.tests.review.day7_8_9;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablePractice extends TestBase {


    @Test
    public void web_table_test(){
        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/tables
        driver.get("https://practice.cydeo.com/tables");

        // 3. Print table data as a single String, not so common, but useful sometimes
        WebElement table1 = driver.findElement(By.id("table1"));

        System.out.println("table1.getText() = " + table1.getText());

        // 4. verify tconway@earthlink.net is anywhere in the table
        Assert.assertTrue(table1.getText().contains("tconway@earthlink.net"));

        // 5. print all column names in single line
        WebElement colNames = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("colNames.getText() = " + colNames.getText());

        // 6. print each column name in separate lines using a loop and findElements method
        List<WebElement> allColNames = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

        for (WebElement eachColName : allColNames) {
            System.out.println("eachColName.getText() = " + eachColName.getText());
        }

        // 7. verify Tim due money is $50.00
        WebElement timDue = driver.findElement(By.xpath("//table[@id='table1']//td[.='tconway@earthlink.net']/following-sibling::td[1]"));
        WebElement timDue2 = driver.findElement(By.xpath("//table[@id='table1']//td[.='tconway@earthlink.net']/../td[.='$50.00']"));

        Assert.assertEquals(timDue.getText(),"$50.00");


    }
}
