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

    public void navigationalPanelExpanded() {
        WebElement panel = getDriver().findElement(By.xpath("//div[@class='oxd-sidepanel-body']"));
        Assert.assertTrue(panel.isDisplayed());
    }

    public void toggleNavigationPanel() {
        WebElement toggleButton = getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/div/div/button"));
        toggleButton.click();

        System.out.println("Navigational panel toggled.");
    }

    public void navigationalPanelCollapsable() {
        WebElement navPanel = getDriver().findElement(By.xpath("//div[contains(@class, 'oxd-sidepanel')]"));

        String panelClass = navPanel.getAttribute("class");
        if (panelClass.contains("oxd-sidepanel--expanded")) {
            System.out.println("The navigational panel is expanded.");
        } else if (panelClass.contains("oxd-sidepanel--collapsed")) {
            System.out.println("The navigational panel is collapsed.");
        } else {
            System.out.println("The navigational panel state is unknown.");
        }
    }

    public void toggleButtonVisible() {
        WebElement toggleBtn = getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/div/div/button"));
        if (toggleBtn.isDisplayed()) {
            System.out.println("The toggle button is visible.");
        } else {
            throw new AssertionError("The toggle button is not visible.");
        }
    }

    public void viewDashOnMobile() {
        WebElement viewDash = getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div[2]"));
        if (viewDash.isDisplayed()) {
            System.out.println("The dashboard is visible in mobile view.");
        } else {
            throw new AssertionError("The dashboard is not visible in mobile view.");
        }
    }

    public void widgetsFitScreen() {
        List<WebElement> widgets = getDriver().findElements(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]"));
        if (widgets.isEmpty()) {
            throw new AssertionError("No widgets are visible in mobile view.");
        }

        System.out.println("Widgets visible in mobile view:");
        for (WebElement widget : widgets) {
            System.out.println(widget.getText());


        }

    }

    public void navMenuVisible() {
        WebElement navMenu = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul"));
        if (navMenu.isDisplayed()) {
            System.out.println("The navigation menu is visible.");
        } else {
            throw new AssertionError("The navigation menu is not visible.");
        }
    }

    public void displayUserProfilePic() {
        WebElement profilePic = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img"));
        Assert.assertTrue(profilePic.isDisplayed());
    }

    public void displayUserName() {
        WebElement displayName = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
        Assert.assertTrue(displayName.isDisplayed());
    }
}








    //public void isNavigationMenuFunctional() {
        //WebElement navMenu =  getDriver().findElement(By.xpath("//div[@class='oxd-sidepanel']"));
        //Assert.assertTrue(navMenu.isDisplayed());











