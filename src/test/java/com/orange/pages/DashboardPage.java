package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DashboardPage {

    WebElement dashboardMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/dashboard/index']"));
dashboardMenu.click();

    WebElement helpMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/help/viewHelpPage']"));
helpMenu.click();



}

}