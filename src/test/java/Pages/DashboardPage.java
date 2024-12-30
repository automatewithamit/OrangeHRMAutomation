package Pages;

import com.framework.core.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class DashboardPage extends Header {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public DashboardPage() {

    }

    // Method to click the Dashboard Menu
    public void clickDashboardMenu() {
        WebElement dashboardMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/dashboard/index']"));
        dashboardMenu.click();
    }

    // Method to click the Help Menu
    public void clickHelpMenu() {
        WebElement helpMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/help/viewHelpPage']"));
        helpMenu.click();
    }

    public void isRedirected() {
        WebElement dashboardPage = driver.findElement(By.xpath("//div[@class='oxd-layout-context']"));
        Assert.assertTrue(dashboardPage.isDisplayed());
    }

    public void isLogoDisplayed() {
        WebElement headerLogo = driver.findElement(By.xpath("//a[@class='oxd-brand']"));
        Assert.assertTrue(headerLogo.isDisplayed());
    }

    public void isUserProfileDisplayed() {
        WebElement profileInfo = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        Assert.assertTrue(profileInfo.isDisplayed());
    }

    public void isWidgetVisible() {
        WebElement widgetLayout = driver.findElement(By.xpath("//div[@class='oxd-layout-context']"));
        List<WebElement> widgets = widgetLayout.findElements(By.className("oxd-layout-context"));

        for (WebElement widget : widgets) {
            if (!widgetLayout.isDisplayed()) {
                throw new AssertionError("Widget is not visible on the dashboard: " + widget.getAttribute("id"));
            }
        }
        System.out.println("All widgets are visible on the dashboard.");
    }

    public void isNavigationMenuFunctional() {
        WebElement navMenu =  driver.findElement(By.xpath("//div[@class='oxd-sidepanel']"));
        Assert.assertTrue(navMenu.isDisplayed());
    }

    }








