package com.testingacademy.tests;


import com.testingacademy.pages.PageObjectModel.DashboardPage_POM;
import com.testingacademy.pages.PageObjectModel.LoginPage_POM;
import com.testingacademy.testbase.CommontoallTestcases;
import com.testingacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class testloginVWO_POM extends CommontoallTestcases {


    @Test(groups = {"smoke"}, priority = 1)
        public void testLoginnegative() throws InterruptedException, IOException {

            LoginPage_POM loginPagePom = new LoginPage_POM();
            loginPagePom.openurl();
            String error_msg_text  =  loginPagePom.loginwithinvalidcreeds();
            // TestNG
            Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");

            // AssertJ
            Assertions.assertThat(error_msg_text )
                    .isNotNull()
                    .isNotBlank()
                    .contains(PropertyReader.readkey("error_message"));
        }

    @Test(priority = 2)
    public void testLoginpositive() throws InterruptedException, IOException {

        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openurl();
        loginPagePom.loginwithvalidcreeds();
        DashboardPage_POM dashboardPagePom = loginPagePom.afterLoginVWOValidCreds();
        String expected_username = dashboardPagePom.loggedinusername();
        // TestNG
//        Assert.assertEquals(expected_username, PropertyReader.readyKey("expected_username"));
//
//        // AssertJ
//        Assertions.assertThat(expected_username)
//                .isNotNull()
//                .isNotBlank()
//                .contains(PropertyReader.readyKey("expected_username"));
    }



    }



