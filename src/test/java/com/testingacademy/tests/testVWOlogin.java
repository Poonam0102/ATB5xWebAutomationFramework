package com.testingacademy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testVWOlogin {

    @Test

    public void testloginpositive(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }

}
