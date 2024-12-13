package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PerformancePage {

    WebElement performanceMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/viewPerformanceModule']"));
performanceMenu.click();


    WebElement configureMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/configurePerformance']"));
configureMenu.click();


    WebElement manageReviewsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/manageReviews']"));
manageReviewsMenu.click();


    WebElement myTrackersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/myTrackers']"));
myTrackersMenu.click();


    WebElement employeeTrackersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/performance/employeeTrackers']"));
employeeTrackersMenu.click();

}


