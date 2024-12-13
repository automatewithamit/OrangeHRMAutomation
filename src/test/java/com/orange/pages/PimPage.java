package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PimPage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public PimPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the PIM Menu
    public void clickPimMenu() {
        WebElement pimMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']"));
        pimMenu.click();
    }

    // Method to click Configurations Menu
    public void clickConfigurationsMenu() {
        WebElement configurationsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/configurePim']"));
        configurationsMenu.click();
    }

    // Method to click Employee List Menu
    public void clickEmployeeListMenu() {
        WebElement employeeListMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewEmployeeList']"));
        employeeListMenu.click();
    }

    // Method to click Add Employee Menu
    public void clickAddEmployeeMenu() {
        WebElement addEmployeeMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/addEmployee']"));
        addEmployeeMenu.click();
    }

    // Method to click Reports Menu
    public void clickReportsMenu() {
        WebElement reportsMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewReports']"));
        reportsMenu.click();
    }
}
