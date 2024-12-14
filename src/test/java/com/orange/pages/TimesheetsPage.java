package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TimesheetsPage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public TimesheetsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the Time Menu
    public void clickTimeMenu() {
        WebElement timeMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewTimeModule']"));
        timeMenu.click();
    }

    // Method to click the Timesheets Menu
    public void clickTimesheetsMenu() {
        WebElement timesheetsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewTimesheet']"));
        timesheetsMenu.click();
    }

    // Method to click the Attendance Menu
    public void clickAttendanceMenu() {
        WebElement attendanceMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewAttendanceRecord']"));
        attendanceMenu.click();
    }

    // Method to click the Reports Menu
    public void clickReportsMenu() {
        WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewEmployeeTimesheetReport']"));
        reportsMenu.click();
    }

    // Method to click the Project Info Menu
    public void clickProjectInfoMenu() {
        WebElement projectInfoMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewProjectInfo']"));
        projectInfoMenu.click();
    }
}


