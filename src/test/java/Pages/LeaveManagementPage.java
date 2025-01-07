package Pages;

import Utils.ConfigReader;
import com.framework.web_elements.Button;
import com.framework.web_elements.TextBox;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import static com.framework.core.BrowserManager.getDriver;


public class LeaveManagementPage extends Header{

    Button loginButton = new Button(By.xpath("//button[@type='submit']"));
    Button approvedButton = new Button(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])"));
    TextBox userNameTextBox = new TextBox(By.xpath("//input[@placeholder='Username']"));
    TextBox passwordTextBox = new TextBox(By.xpath("//input[@placeholder='Password']"));

    public void enterCredentials()
    {
        userNameTextBox.setText(ConfigReader.read("userName"));
        passwordTextBox.setText(ConfigReader.read("password"));
    }

    public void clickLogin()
    {
        loginButton.click();
    }

    public void validateDashBoard()
    {
        WebElement dashboard = getDriver().findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        Assert.assertTrue(dashboard.isDisplayed());
    }

    public void validateStatus()
    {
        WebElement status = getDriver().findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[7]"));
        Assert.assertTrue(status.isDisplayed());
    }

    public void clickLeaveList()
    {
        WebElement leaveList = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[3]"));
        leaveList.click();
    }

    public void locateApprovedStatus()
    {
        WebElement approved = getDriver().findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])"));
        Assert.assertTrue(approved.isDisplayed());
    }

    public void clickApprovedBtn()
    {
        approvedButton.click();
    }
    //button[text()=' Approve ']
    public void leaveStatus()
    {
        WebElement scheduled = getDriver().findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[2]/div[1]/div[1]"));
        Assert.assertTrue(scheduled.isDisplayed());
    }

    public void validateAdmEntitlement()
    {
        WebElement leaveType= getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
        leaveType.click();
        WebElement canFMLA= getDriver().findElement(By.xpath("(//div[@class='oxd-select-option'])[2]"));
        canFMLA.click();
        WebElement searchRBtn= getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        searchRBtn.click();
        WebElement admEnt = getDriver().findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][6]"));
        Assert.assertTrue(admEnt.isDisplayed());
    }
    // Method to click the Apply Menu
    public void clickApplyMenu() {
        WebElement applyMenu = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]"));
        applyMenu.click();
    }////a[text()='Apply']

    public void applyLeaveType()
    {
        WebElement applyLeaveTypeAdm = getDriver().findElement(By.xpath("//div[@class='oxd-select-text-input']"));
        applyLeaveTypeAdm.click();
    }////div[text()='-- Select --']

    public void selectCanFMLA()
    {
        WebElement canFMLA = getDriver().findElement(By.xpath("//span[text()='CAN - FMLA']"));
        canFMLA.click();
    }

    public void enterStartDate()
    {
        WebElement fromDate = getDriver().findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        fromDate.click();

        WebElement startDate = getDriver().findElement(By.xpath("//div[@class='oxd-calendar-date' and text()='30']"));
        startDate.click();
    }

    public void enterEndDate(){
        WebElement toDate= getDriver().findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]"));
        toDate.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement endDate = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='oxd-calendar-date' and text()='31']")));
        endDate.click();

    }

    public void clickApplyBtn()
    {
        WebElement applyBtn = getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        applyBtn.click();
    }////button[text()=' Apply ']

    public void validateAdmApply()
    {
        WebElement pendingApproval = getDriver().findElement(By.xpath("//div[text()='Pending Approval (2.00)']"));
        Assert.assertTrue(pendingApproval.isDisplayed());
    }

    public void validateNoAction()
    {
        WebElement actionBtnNoMessage = getDriver().findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
        Assert.assertTrue(actionBtnNoMessage.isDisplayed());
    }

    // Method to click Entitlements Menu
    public void clickEntitlementsMenu() {
        WebElement entitlementsMenu = getDriver().findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]"));
        entitlementsMenu.click();
    }////span[text()='Entitlements ']

    public void selectAddEntitlements()
    {
        WebElement addEntitlements = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]"));
        addEntitlements.click();
    }////a[text()='Add Entitlements']

    public void selectMyEntitlements()
    {
        WebElement myEntitlements = getDriver().findElement(By.xpath("//a[@role='menuitem' and text()='My Entitlements']"));
        myEntitlements.click();
    }
    public void selectMultipleEmployee()
    {
        WebElement multipleEmp = getDriver().findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
        multipleEmp.click();
    }////label[text()='Multiple Employees']

    public void selectLeaveType()
    {
        WebElement leaveType = getDriver().findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        leaveType.click();
    }

    public void selectCANPersonal()
    {
        WebElement canPersonal = getDriver().findElement(By.xpath("//span[text()='CAN - Personal']"));
        canPersonal.click();
    }

    public void selectLeavePeriod()
    {
        WebElement theLeavePeriod = getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        theLeavePeriod.click();
    }

    public void inputEntitlements()
    {
        WebElement inpEntitlement = getDriver().findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
        inpEntitlement.sendKeys("15");
    }

    public void clickSaveBtn()
    {
        WebElement saveBtn = getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        saveBtn.click();
    }////button[text()=' Save ']

    public void validateUpdateEntitlement()
    {
       WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement popUpHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow orangehrm-dialog-modal']")));
        Assert.assertTrue(popUpHeader.isDisplayed());
    }

    public void clickConfigureMenu()
    {
        WebElement configureMenu = getDriver().findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]"));
        configureMenu.click();
    }////span[text()='Configure ']

    public void selectLeaveTypeConfi()
    {
        WebElement leaveTypeConfi = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]"));
        leaveTypeConfi.click();
    }////a[text()='Leave Types']

    public void clickAddBtn()
    {
        WebElement addBtn = getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
        addBtn.click();
    }////button[text()=' Add ']

    public void addLeaveType(){
        WebElement newLeaveType = getDriver().findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']"));
        newLeaveType.clear();
        newLeaveType.sendKeys("Jury - Duty");
    }

    public void clickSaveBtnConfi()
    {
        WebElement saveBtnConfi = getDriver().findElement(By.xpath("//button[@type='submit']"));
        saveBtnConfi.click();
    }

    public void validateNewLeaveType() {
        WebElement juryDutyType = getDriver().findElement(By.xpath("//div[(text()='Jury - Duty')]"));
        Assert.assertTrue(juryDutyType.isDisplayed());
    }

    // Method to click Reports Menu
    public void clickReportsMenu() {
        WebElement reportsMenu = getDriver().findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]"));
        reportsMenu.click();
    }////span[text()='Reports ']

    public void selectLeaveEntAndUsgReport()
    {
        WebElement leaveEntitlementAndUsageReport = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]"));
        leaveEntitlementAndUsageReport.click();
    }////a[text()='Leave Entitlements and Usage Report']

    public void clickLeaveType()
    {
        WebElement leaveTypeRBtn = getDriver().findElement(By.xpath("(//label[@class='oxd-label'])[2]"));
        leaveTypeRBtn.click();
    }////label[contains(text(),'Leave Type')]

    public void clickGenerateButton()
    {
        WebElement generateBtn = getDriver().findElement(By.xpath("//button[@type='submit']"));
        generateBtn.click();
    }

    public void validateReport()
    {
        WebElement validateReports = getDriver().findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-text--count']"));
        Assert.assertTrue(validateReports.isDisplayed());
    }


    // Method to click My Leave Menu
    public void clickMyLeaveMenu() {
        WebElement myLeaveMenu = getDriver().findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]"));
        myLeaveMenu.click();
    }////a[text()='My Leave']


}



