package com.cydeo.tests.review.day10_11_12;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SingletonDriverVersion {


    @Test (priority = 1)
    public void googleTitle(){
        Driver.getDriver().get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }

    @Test (priority = 2)
    public void yahooTitle(){
        Driver.getDriver().get("https://amazon.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }

    @Test (priority = 3)
    public void etsyTitle(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }


}
