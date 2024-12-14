package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PerformancePage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public PerformancePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the Performance Menu
    public void clickPerformanceMenu() {
        WebElement performanceMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/viewPerformanceModule']"));
        performanceMenu.click();
    }

    // Method to click the Configure Menu
    public void clickConfigureMenu() {
        WebElement configureMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/configurePerformance']"));
        configureMenu.click();
    }

    // Method to click the Manage Reviews Menu
    public void clickManageReviewsMenu() {
        WebElement manageReviewsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/manageReviews']"));
        manageReviewsMenu.click();
    }

    // Method to click the My Trackers Menu
    public void clickMyTrackersMenu() {
        WebElement myTrackersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/myTrackers']"));
        myTrackersMenu.click();
    }

    // Method to click the Employee Trackers Menu
    public void clickEmployeeTrackersMenu() {
        WebElement employeeTrackersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/employeeTrackers']"));
        employeeTrackersMenu.click();
    }
}

