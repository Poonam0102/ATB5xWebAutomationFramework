package com.testingacademy.pages.PageObjectModel;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;

import javax.swing.*;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM() {

    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    public String loggedinusername(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }



}
