package com.testCases;

import com.beust.jcommander.Parameter;
import com.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;


public class BaseClass {
    //Create an readCOnfig object
    ReadConfig readConfig = new ReadConfig();
    //initiate variables from readConfig file
    public String baseURL = readConfig.getApplicationURL();
    public String userName = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    public static void setup() {

        driver = setDriver();

    }

    public static ChromeDriver setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
