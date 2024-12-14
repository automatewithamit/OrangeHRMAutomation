package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the Dashboard Menu
    public void clickDashboardMenu() {
        WebElement dashboardMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/dashboard/index']"));
        dashboardMenu.click();
    }

    // Method to click the Help Menu
    public void clickHelpMenu() {
        WebElement helpMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/help/viewHelpPage']"));
        helpMenu.click();
    }

}
