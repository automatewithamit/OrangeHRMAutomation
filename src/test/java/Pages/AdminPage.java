package Pages;

import org.openqa.selenium.By;
import static com.framework.core.BrowserManager.getDriver;
import org.openqa.selenium.WebElement;

public class AdminPage extends Header {


    // Method to click the Admin Menu
    public void clickAdminMenu() {
        WebElement adminMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers'] > span"));
        adminMenu.click();
    }

    // Method to click User Management
    public void clickUserManagement() {
        WebElement userManagement = getDriver().findElement(By.cssSelector("li.oxd-dropdown-menu-item > a[href='#']"));
        userManagement.click();
    }

    // Method to click Users Menu
    public void clickUsersMenu() {
        WebElement usersMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/admin/viewSystemUsers']"));
        usersMenu.click();
    }

    // Method to click Job Menu
    public void clickJobMenu() {
        WebElement jobMenu = getDriver().findElement(By.xpath("//a[text()='Job']"));
        jobMenu.click();
    }

    // Method to click Organization Menu
    public void clickOrganizationMenu() {
        WebElement organizationMenu = getDriver().findElement(By.xpath("//a[text()='Organization']"));
        organizationMenu.click();
    }

    // Method to click More Menu
    public void clickMoreMenu() {
        WebElement moreMenu = getDriver().findElement(By.xpath("//a[text()='More']"));
        moreMenu.click();
    }
}





