package com.testingacademy.testbase;

import com.testingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommontoallTestcases {

    @BeforeMethod
    public void setup(){
    DriverManager.init();
    }

    @AfterMethod
    public void teardown(){
        DriverManager.down();
    }
}
