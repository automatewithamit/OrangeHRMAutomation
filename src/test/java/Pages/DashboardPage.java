package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.framework.core.BrowserManager.getDriver;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DashboardPage extends Header {

    //private WebDriver driver;

    // Constructor to initialize WebDriver
    //public DashboardPage(WebDriver driver) {
    //this.driver = driver;


    public DashboardPage() {

    }

    // Method to click the Dashboard Menu
    public void clickDashboardMenu() {
        WebElement dashboardMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/dashboard/index']"));
        dashboardMenu.click();
    }

    // Method to click the Help Menu
    public void clickHelpMenu() {
        WebElement helpMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/help/viewHelpPage']"));
        helpMenu.click();
    }

    public void isRedirected() {
        WebElement dashboardPage = getDriver().findElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));
        Assert.assertTrue(dashboardPage.isDisplayed());
        //WebElement dashboardElement = driver.findElement(By.xpath("//div[@class='oxd-layout-context']"));
        //dashboardElement.isDisplayed();
//"//div[@class='oxd-layout-context']"))
    }

    public void isLogoDisplayed() {
        WebElement headerLogo = getDriver().findElement(By.xpath("//a[@class='oxd-brand']"));
        Assert.assertTrue(headerLogo.isDisplayed());
    }

    public void isUserProfileDisplayed() {
        WebElement profileInfo = getDriver().findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        Assert.assertTrue(profileInfo.isDisplayed());
    }

    public void isWidgetVisible() {
        WebElement widgetLayout = getDriver().findElement(By.xpath("//div[@class='oxd-layout-context']"));
        List<WebElement> widgets = widgetLayout.findElements(By.className("oxd-layout-context"));

        for (WebElement widget : widgets) {
            if (!widgetLayout.isDisplayed()) {
                throw new AssertionError("Widget is not visible on the dashboard: " + widget.getAttribute("id"));
            }
        }
        System.out.println("All widgets are visible on the dashboard.");
    }

    public void isNavigationalPanelExpanded() {
        WebElement panel = getDriver().findElement(By.xpath("//div[@class='oxd-sidepanel-body']"));
        Assert.assertTrue(panel.isDisplayed());
    }

    public void isPanelButtonClickable() {
        WebElement buttonIcon = getDriver().findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']"));
        Assert.assertTrue(buttonIcon.isEnabled());
    }

    public void isNavigationalPanelCollapsable() {
    }

    public void isButtonVisible() {
    }
}


    //public void isNavigationMenuFunctional() {
        //WebElement navMenu =  getDriver().findElement(By.xpath("//div[@class='oxd-sidepanel']"));
        //Assert.assertTrue(navMenu.isDisplayed());











