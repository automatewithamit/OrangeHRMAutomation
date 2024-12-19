package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage extends BasePage {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click the Admin Menu
    public void clickAdminMenu() {
        WebElement adminMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers'] > span"));
        adminMenu.click();
    }

    // Method to click User Management
    public void clickUserManagement() {
        WebElement userManagement = driver.findElement(By.cssSelector("li.oxd-dropdown-menu-item > a[href='#']"));
        userManagement.click();
    }

    // Method to click Users Menu
    public void clickUsersMenu() {
        WebElement usersMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers']"));
        usersMenu.click();
    }

    // Method to click Job Menu
    public void clickJobMenu() {
        WebElement jobMenu = driver.findElement(By.xpath("//a[text()='Job']"));
        jobMenu.click();
    }

    // Method to click Organization Menu
    public void clickOrganizationMenu() {
        WebElement organizationMenu = driver.findElement(By.xpath("//a[text()='Organization']"));
        organizationMenu.click();
    }

    // Method to click More Menu
    public void clickMoreMenu() {
        WebElement moreMenu = driver.findElement(By.xpath("//a[text()='More']"));
        moreMenu.click();
    }
}





