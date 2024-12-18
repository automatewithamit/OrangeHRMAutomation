package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LeaveManagementPage {

    public WebDriver driver;

    @FindBy(xpath="//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath="//input[@name='password']")
    private WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboard;


    // Constructor to initialize WebDriver
    public LeaveManagementPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterCredential(String user, String pass)
    {
        userName.sendKeys(user);
        password.sendKeys(pass);
    }

    public void clickLogin()
    {
        loginBtn.click();
    }

    public void validateDashBoard()
    {
        Assert.assertTrue(dashboard.isDisplayed());
    }

    // Method to click the Leave Menu
    public void clickLeaveMenu() {
        WebElement leaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveModule']"));
        leaveMenu.click();
    }

    // Method to click the Apply Menu
    public void clickApplyMenu() {
        WebElement applyMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/applyLeave']"));
        applyMenu.click();
    }

    // Method to click My Leave Menu
    public void clickMyLeaveMenu() {
        WebElement myLeaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewMyLeaveList']"));
        myLeaveMenu.click();
    }

    // Method to click Entitlements Menu
    public void clickEntitlementsMenu() {
        WebElement entitlementsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveEntitlement']"));
        entitlementsMenu.click();
    }

    // Method to click Reports Menu
    public void clickReportsMenu() {
        WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveReport']"));
        reportsMenu.click();
    }
}

// Method
