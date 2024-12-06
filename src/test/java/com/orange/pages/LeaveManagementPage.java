package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LeaveManagementPage {

    WebElement leaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveModule']"));
leaveMenu.click();

    WebElement applyMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/applyLeave']"));
applyMenu.click();

    WebElement myLeaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewMyLeaveList']"));
myLeaveMenu.click();

    WebElement entitlementsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveEntitlement']"));
entitlementsMenu.click();

    WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveReport']"));
reportsMenu.click();

    WebElement moreMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveList']"));
moreMenu.click();



}
