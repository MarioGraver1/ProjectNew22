package com.testCases;

import com.pageObjects.LoginPage;
import org.apache.log4j.Logger;
import org.junit.Assert;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_LoginTest_001 extends BaseClass {


    @Test
    public void loginPageTest() {

        driver.get(baseURL);

        LoginPage lp = new LoginPage(driver);

        lp.demoSiteIspresent();

        lp.clickDropDownBankProject();


    }

}
