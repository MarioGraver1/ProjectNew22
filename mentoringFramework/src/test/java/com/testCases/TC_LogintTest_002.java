package com.testCases;

import com.pageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class TC_LogintTest_002 extends BaseClass{

    @Test
    public void loginTest() {
        driver.get(baseURL);

        LoginPage lp = new LoginPage(driver);

        lp.setTxtUserName(userName);
        lp.setTxtPassword(password);

        lp.clickSubmit();

        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }


    }
}
