package Pages;

import Utils.ConfigReader;
import com.framework.web_elements.Button;
import com.framework.web_elements.DropDown;
import com.framework.web_elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.framework.core.BrowserManager.getDriver;

public class PerformancePage extends Header{


    TextBox userName=new TextBox(By.xpath("//input[@placeholder='Username']"));
    TextBox passWord=new TextBox(By.xpath("//input[@placeholder='Password']"));
    Button loginButton = new Button(By.xpath("//button[@type='submit']"));
    DropDown manageReviewsDB=new DropDown(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']"));

    //Method for entering Login/Password
    public void enterLoginPassword()
    {
        userName.setText(ConfigReader.read("userName"));
        passWord.setText(ConfigReader.read("password"));
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public  void setManageReviewsDB(String option){
        manageReviewsDB.selectOption(option);

    }

    public void dashboardValidation(){
        WebElement validationD= getDriver().findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text')]"));
        Assert.assertTrue(validationD.isDisplayed());
    }

    public void myReviewsValidation(){
        WebElement validateMR= getDriver().findElement(By.xpath("//h6[contains(@class,'angehrm-main-title')]"));
        Assert.assertTrue(validateMR.isDisplayed());
    }




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
        WebElement manageReviewsMenu = getDriver().findElement(By.xpath("//span[text()='Manage Reviews ']"));
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

