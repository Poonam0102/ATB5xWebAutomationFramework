package com.testingacademy.base;

import com.testingacademy.driver.DriverManager;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class CommonToAllPage extends DriverManager{

    public CommonToAllPage(){
     super();
            }

     public  void openurl() throws IOException {
        getDriver().get(PropertyReader.readkey("url"));
     }
     public void Clickelement(By by){
         DriverManager.getDriver().findElement(by).click();
     }

     public void enterInput(By by,String key){
        DriverManager.getDriver().findElement(by).sendKeys(key);

     }


     public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement( By key) {
        return DriverManager.getDriver().findElement(key);
    }



}
