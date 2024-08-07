package com.testingacademy.pages.PageObjectModel;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage_POM extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_POM() {
        super();
//        driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");
    }

    //Page Locators
    By Username = By.id("login-username");
    By Password = By.name("password");
    By signinbtn = By.id("js-login-btn");
    By error_msg = By.className("notification-box-description");

    //Page Action

    public String loginwithinvalidcreeds() throws InterruptedException, IOException {
//        enterInput(Username,"admin");
        enterInput(Username, PropertyReader.readkey("username"));
        enterInput(Password,"admin@admin.com");
        Clickelement(signinbtn);
        Thread.sleep(3000); // use presence of element method to verify
       return getElement(error_msg).getText();
//        driver.findElement(Username).sendKeys("admin");
//        driver.findElement(Password).sendKeys("admin@admin.com");
//        driver.findElement(signinbtn).click();

//        return driver.findElement(error_msg).getText();
    }

    public String loginwithvalidcreeds() throws InterruptedException, IOException {

        enterInput(Username, PropertyReader.readkey("username"));
        presenceOfElement(Password);
        enterInput(Password,PropertyReader.readkey("password"));
        Clickelement(signinbtn);
        return null; // return should be dashboard visibility
    }

    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }
}

