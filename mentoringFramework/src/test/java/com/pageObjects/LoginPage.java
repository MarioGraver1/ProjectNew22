package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import static com.testCases.BaseClass.wait;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //Elements
    @FindBy(name = "uid")
    WebElement txtUserName;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    WebElement btnLogin;

    @FindBy(id = "site-name")
    WebElement demoSite;

    @FindBy(xpath = "(//a[contains(@class,'dropdown-toggle')])[2]")
    WebElement bankProject;


    //Actions
    public void setTxtUserName(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        btnLogin.click();
    }

    public void demoSiteIspresent() {
        demoSite.isDisplayed();
    }

    public void clickDropDownBankProject() {
        bankProject.click();
    }

}
