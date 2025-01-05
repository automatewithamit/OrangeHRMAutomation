package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.framework.core.BrowserManager.getDriver;

public class PerformancePage extends Header{

    // Method to click the Performance Menu
    public void clickPerformanceMenu() {
        WebElement performanceMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/viewPerformanceModule']"));
        performanceMenu.click();
    }

    // Method to click the Configure Menu
    public void clickConfigureMenu() {
        WebElement configureMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/configurePerformance']"));
        configureMenu.click();
    }

    // Method to click the Manage Reviews Menu
    public void clickManageReviewsMenu() {
        WebElement manageReviewsMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/manageReviews']"));
        manageReviewsMenu.click();
    }

    // Method to click the My Trackers Menu
    public void clickMyTrackersMenu() {
        WebElement myTrackersMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/myTrackers']"));
        myTrackersMenu.click();
    }

    // Method to click the Employee Trackers Menu
    public void clickEmployeeTrackersMenu() {
        WebElement employeeTrackersMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/employeeTrackers']"));
        employeeTrackersMenu.click();
    }
}

