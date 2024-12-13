package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PimPage {



    public PimPage {
        WebElement pimMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']"));
        pimMenu.click();

        WebElement configurationsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/configurePim']"));
        configurationsMenu.click();

        WebElement employeeListMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewEmployeeList']"));
        employeeListMenu.click();

        WebElement addEmployeeMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/addEmployee']"));
        addEmployeeMenu.click();

        WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewReports']"));
        reportsMenu.click();


