package com.testingacademy.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {

   public static WebDriver driver;

   public static WebDriver getDriver(){
       return driver;
   }

    public static void init(){
        if(driver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--guest");
//            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }
    }


    public static void down(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
