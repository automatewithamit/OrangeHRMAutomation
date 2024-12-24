package Pages;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LeaveManagementPage {

    public WebDriver driver;


    // Constructor to initialize WebDriver
    public LeaveManagementPage() {

    }

    public void enterCredential(String username, String pass)
    {

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(username);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(pass);
    }

    public void clickLogin()
    {
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
    }

    public void validateDashBoard()
    {
        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        Assert.assertTrue(dashboard.isDisplayed());
    }

    public void validateStatus()
    {
        WebElement status = driver.findElement(By.xpath("//div[contains(text(),'Pending')][1]"));
        Assert.assertTrue(status.isDisplayed());
    }

    public void locateApprovedStatus()
    {
        WebElement approved = driver.findElement(By.xpath("//button[text()=' Approve ']"));
        Assert.assertTrue(approved.isDisplayed());
    }

    public void clickApprovedBtn()
    {
        WebElement approved = driver.findElement(By.xpath("//button[text()=' Approve ']"));
        approved.click();
    }

    // Method to click the Leave Menu
    public void clickLeaveMenu() {
        WebElement leaveMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/leave/viewLeaveModule']"));
        leaveMenu.click();
    }

    // Method to click the Apply Menu
    public void clickApplyMenu() {
        WebElement applyMenu = driver.findElement(By.xpath("//a[text()='Apply']"));
        applyMenu.click();
    }

    // Method to click My Leave Menu
    public void clickMyLeaveMenu() {
        WebElement myLeaveMenu = driver.findElement(By.xpath("//a[text()='My Leave']"));
        myLeaveMenu.click();
    }

    // Method to click Entitlements Menu
    public void clickEntitlementsMenu() {
        WebElement entitlementsMenu = driver.findElement(By.xpath("//span[text()='Entitlements ']"));
        entitlementsMenu.click();
    }

    public void selectAddEntitlements()
    {
        WebElement addEntitlements = driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
        addEntitlements.click();
    }

    public void selectMultipleEmployee()
    {
        WebElement multipleEmp = driver.findElement(By.xpath("//label[text()='Multiple Employees']"));
        multipleEmp.click();
    }

    public void selectLeaveType()
    {
        WebElement leaveType = driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        leaveType.click();
    }

    public void selectCANPersonal()
    {
        WebElement canPersonal = driver.findElement(By.xpath("//div[text()='CAN - Personal']"));
        canPersonal.click();
    }

    public void inputEntitlements()
    {
        WebElement inpEntitlement = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
        inpEntitlement.sendKeys("15");
    }

    public void clickSaveBtn()
    {
        WebElement saveBtn = driver.findElement(By.xpath("//button[text()=' Save ']"));
        saveBtn.click();
    }

    public void validateUpdateEntitlement()
    {
        WebElement popUpEnt = driver.findElement(By.xpath("Updating Entitlement - Matching Employees"));
        String actual = popUpEnt.getText();
        String expected = "Updating Entitlement - Matching Employees";
        Assert.assertEquals(actual,expected);
    }

    public void validateCancelConfirmBtn()
    {
        WebElement confirmBtn = driver.findElement(By.xpath("//button[text()=' Confirm ']"));
        Assert.assertTrue(confirmBtn.isDisplayed());
    }

    // Method to click Reports Menu
    public void clickReportsMenu() {
        WebElement reportsMenu = driver.findElement(By.xpath("//span[text()='Reports ']"));
        reportsMenu.click();
    }

    public void selectLeaveEntAndUsgReport()
    {
        WebElement leaveEntitlementAndUsageReport = driver.findElement(By.xpath("//a[text()='Leave Entitlements and Usage Report']"));
        leaveEntitlementAndUsageReport.click();
    }

    public void clickLeaveType()
    {
        WebElement leaveTypeRBtn = driver.findElement(By.xpath("//label[contains(text(),'Leave Type')]"));
        leaveTypeRBtn.click();
    }

    public void selectLeavePeriod()
    {
        WebElement theLeavePeriod = driver.findElement(By.xpath("//div[contains(text(),'2024-01-01 - 2024-31-12')]"));
        theLeavePeriod.click();
    }

    public void clickGenerateButton()
    {
        WebElement generateBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        generateBtn.click();
    }

    public void validateReport()
    {
        WebElement validateReports = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-text--count']"));
        Assert.assertTrue(validateReports.isDisplayed());
    }
    public void clickLeaveList()
    {
        WebElement leaveList = driver.findElement(By.xpath("//a[text()='Leave List']"));
        leaveList.click();
    }


    public void leaveStatus()
    {
        WebElement leaveStatus = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]"));
        leaveStatus.click();
        WebElement scheduled = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[2]/div[1]/div[1]"));
        scheduled.click();
        WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
        search.click();
    }

    public void validateAdmEntitlement()
    {
        WebElement admEnt = driver.findElement(By.xpath("//span[text()='Total 23.00 Day(s)']"));
        Assert.assertTrue(admEnt.isDisplayed());
    }

    public void applyLeaveType()
    {
        WebElement applyLeaveTypeAdm = driver.findElement(By.xpath("//div[text()='-- Select --']"));
        applyLeaveTypeAdm.click();
    }

    public void selectCanFMLA()
    {
        WebElement canFMLA = driver.findElement(By.xpath("//div[text()='CAN - FMLA']"));
        canFMLA.click();

    }

    public void enterStartDate()
    {
        WebElement fromDate = driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]"));
        fromDate.click();
        WebElement startDate = driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][normalize-space()='30']"));
        startDate.click();

    }

    public void enterEndDate()
    {
        WebElement toDate = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]"));
        toDate.click();
        WebElement endDate = driver.findElement(By.xpath("//div[contains(text(),'31')]"));
        endDate.click();
    }

    public void clickApplyBtn()
    {
        WebElement applyBtn = driver.findElement(By.xpath("//button[text()=' Apply ']"));
        applyBtn.click();
    }

    public void validateAdmApply()
    {
        WebElement pendingApproval = driver.findElement(By.xpath("//div[text()='Pending Approval (2.00)']"));
        Assert.assertTrue(pendingApproval.isDisplayed());
    }

    public void validateNoAction()
    {
        WebElement actionBtnNoMessage = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
        Assert.assertTrue(actionBtnNoMessage.isDisplayed());
    }

    public void clickConfigureMenu()
    {
        WebElement configureMenu = driver.findElement(By.xpath("//span[text()='Configure ']"));
        configureMenu.click();
    }

    public void selectLeaveTypeConfi()
    {
        WebElement leaveTypeConfi = driver.findElement(By.xpath("//a[text()='Leave Types']"));
        leaveTypeConfi.click();
    }

    public void clickAddBtn()
    {
        WebElement addBtn = driver.findElement(By.xpath("//button[text()=' Add ']"));
        addBtn.click();
    }

    public void addLeaveType()
    {
        WebElement newLeaveType = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']"));
        newLeaveType.sendKeys("Jury Duty");
    }

    public void clickSaveBtnConfi()
    {
        WebElement saveBtnConfi = driver.findElement(By.xpath("//button[@type='submit']"));
        saveBtnConfi.click();
    }

    public void validateNewLeaveType()
    {
        WebElement juryDutyType = driver.findElement(By.xpath("//div[(text()='Jury Duty')]"));
        Assert.assertTrue(juryDutyType.isDisplayed());
    }

}



