package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeaveManagementPage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public LeaveManagementPage(WebDriver driver) {
        this.driver = driver;
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
