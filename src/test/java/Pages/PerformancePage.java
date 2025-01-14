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
    Button kpiAddButton=new Button(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    TextBox kpiTextBoxTitle=new TextBox(By.xpath("//input[@placeholder='Search']"));
    Button kpiSaveButton=new Button(By.xpath("//button[contains(@class,'secondary orangehrm-left-space')]"));

    //Method for entering Login/Password
    public void enterLoginPassword()
    {
        userName.setText(ConfigReader.read("userName"));
        passWord.setText(ConfigReader.read("password"));
    }

    public void clickLoginButton(){
        loginButton.click();
    }


    public void dashboardValidation(){
        WebElement validationD= getDriver().findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text')]"));
        Assert.assertTrue(validationD.isDisplayed());
    }

    public void myReviewsValidation(){
        WebElement validateMR= getDriver().findElement(By.xpath("//h6[contains(@class,'angehrm-main-title')]"));
        Assert.assertTrue(validateMR.isDisplayed());
    }

    public void myTrackersValidation(){
        WebElement validateMT= getDriver().findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6 orangehrm')]"));
        Assert.assertTrue(validateMT.isDisplayed());
    }

    public void employeeReview(){
        getDriver().findElement(By.xpath("//a[text()='Employee Reviews']")).click();
    }

    public void employeeReviewValidation(){
        WebElement validateER=getDriver().findElement(By.xpath("//h5[contains(@class,'oxd-text oxd-text--')]"));
        Assert.assertTrue(validateER.isDisplayed());
    }





    // Method to click the Performance Menu
    public void clickPerformanceMenu() {
        WebElement performanceMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/viewPerformanceModule']"));
        performanceMenu.click();
    }

    // Method to click the Configure Menu
    public void clickConfigureMenu() {
        WebElement configureMenu = getDriver().findElement(By.xpath("//span[text()='Configure ']"));
        configureMenu.click();
    }

    // Method to click the Manage Reviews Menu
    public void clickManageReviewsMenu() {
        WebElement manageReviewsMenu = getDriver().findElement(By.xpath("//span[text()='Manage Reviews ']"));
        manageReviewsMenu.click();
    }

    // Method to click the My Trackers Menu
    public void clickMyTrackersMenu() {
        WebElement myTrackersMenu = getDriver().findElement(By.xpath("//a[text()='My Trackers']"));
        myTrackersMenu.click();
    }

    // Method to click the Employee Trackers Menu
    public void clickEmployeeTrackersMenu() {
        WebElement employeeTrackersMenu = getDriver().findElement(By.cssSelector("a[href='/web/index.php/performance/employeeTrackers']"));
        employeeTrackersMenu.click();
    }

    public void myReviewsDropdown(){
        getDriver().findElement(By.xpath("//a[text()='My Reviews']")).click();
    }

    public void kPIDropdown(){
        getDriver().findElement(By.xpath("//a[text()='KPIs']")).click();
    }

    public void clickAddKPIButton(){
        kpiAddButton.click();
    }

    public void enterKPITitle(){
        kpiTextBoxTitle.click();
        kpiTextBoxTitle.setText("Automation Tester");

    }

    public void selectJobTitleDB(){
        WebElement clickJobTitle=getDriver().findElement(By.xpath("//div[@class='oxd-select-wrapper']"));
        clickJobTitle.click();
        WebElement enterTitle=getDriver().findElement(By.xpath("//div[@class='oxd-select-text-input' and text()='Automation tester']"));
        enterTitle.click();
    }

    public void setKpiSaveButton(){
        kpiSaveButton.click();
    }




}

