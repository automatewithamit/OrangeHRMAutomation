package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends BasePage{

    public WebDriver driver;

    // Method to click the Leave Menu
    public void clickLeaveMenu() {
        WebElement leaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveModule']"));
        leaveMenu.click();
    }



    //This page is going to have all the webelements and action methods related to Header


}
