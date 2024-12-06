package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TimesheetsPage {

    WebElement timeMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewTimeModule']"));
timeMenu.click();

    WebElement timesheetsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewTimesheet']"));
timesheetsMenu.click();

    WebElement attendanceMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewAttendanceRecord']"));
attendanceMenu.click();

    WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewEmployeeTimesheetReport']"));
reportsMenu.click();

    WebElement projectInfoMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/time/viewProjectInfo']"));
projectInfoMenu.click();

}
