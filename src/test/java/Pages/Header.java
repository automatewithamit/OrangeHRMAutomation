package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.framework.core.BrowserManager.getDriver;

public class Header extends BasePage{

  //  public WebDriver driver;

    // Method to click the Leave Menu
    public void clickLeaveMenu() {
        WebElement leaveMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveModule']"));
        leaveMenu.click();
    }



    //This page is going to have all the webelements and action methods related to Header


}
