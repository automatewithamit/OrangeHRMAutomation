package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPage {
    WebElement adminMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers'] > span"));
adminMenu.click();

WebElement userManagement = driver.findElement(By.cssSelector("li.oxd-dropdown-menu-item > a[href='#']"));
userManagement.click();

    WebElement usersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers']"));
usersMenu.click();

    WebElement jobMenu = driver.findElement(By.xpath("//a[text()='Job']"));
jobMenu.click();

    WebElement organizationMenu = driver.findElement(By.xpath("//a[text()='Organization']"));
organizationMenu.click();

    WebElement moreMenu = driver.findElement(By.xpath("//a[text()='More']"));
moreMenu.click();




