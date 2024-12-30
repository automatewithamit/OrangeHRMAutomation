package Steps;

import Pages.LeaveManagementPage;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;

import static com.framework.core.BrowserManager.getDriver;

public class LeaveAdminSteps{

    WebDriver driver = getDriver();
    LeaveManagementPage leaveManagementPage = new LeaveManagementPage(driver);
    //Background
    @Given("admin is on the OrangeHRM app")
    public void admin_is_on_the_orange_hrm_app () {
        getDriver().navigate().to(ConfigReader.read("url"));
    }
    @When("admin enters valid username and password")
    public void admin_enters_valid_username_and_password (){
        leaveManagementPage.enterCredentials();
    }
    @When("admin clicks the login button")
    public void admin_clicks_the_login_button () {
        leaveManagementPage.clickLogin();
    }

    @Then("admin is logged into the application")
    public void admin_is_logged_into_the_application () {
        leaveManagementPage.validateDashBoard();
    }


    @Then("admin navigates to the Leave Module")
    public void admin_navigates_to_the_leave_module() {
        leaveManagementPage.clickLeaveMenu();
    }

    //TC06HK @LeaveAdm_06
    @Given("a leave request with the status Pending Approval exists in the Leave List tab")
    public void a_leave_request_with_the_status_pending_approval_exists_in_the_leave_list_tab() {
      leaveManagementPage.validateStatus();
    }
    @When("admin clicks the Leave List tab")
    public void admin_clicks_the_leave_list_tab() {
       leaveManagementPage.clickLeaveList();
    }
    @When("locates a leave request with the status Pending Approval and has actions Approve and Reject")
    public void locates_a_leave_request_with_the_status_pending_approval_and_has_actions_approve_and_reject() {
      leaveManagementPage.locateApprovedStatus();
    }
    @When("clicks Approve button")
    public void clicks_approve_button() {
        leaveManagementPage.clickApprovedBtn();
    }
    @Then("the leave request status changes from Pending Approval to Scheduled")
    public void the_leave_request_status_changes_from_pending_approval_to_scheduled() {
        leaveManagementPage.leaveStatus();
    }


    //TC10HK @LeaveAdm_10
    @Given("Admin has sufficient leave balance")
    public void admin_has_sufficient_leave_balance() {
        leaveManagementPage.validateAdmEntitlement();
    }
    @When("admin clicks the Apply tab")
    public void admin_clicks_the_apply_tab() {
        leaveManagementPage.clickApplyMenu();
    }
    @When("admin selects a valid leave type {string}")
    public void admin_selects_a_valid_leave_type(String arg){
        leaveManagementPage.applyLeaveType();
        leaveManagementPage.selectCanFMLA();
    }
    @When("admin enter a valid date range {string} to {string}")
    public void admin_enter_a_valid_date_range_to(String arg1, String arg2){
        leaveManagementPage.enterStartDate();
        leaveManagementPage.enterEndDate();
    }
   @When("admin clicks Apply button")
    public void admin_clicks_apply_button() {
        leaveManagementPage.clickApplyBtn();
    }

    @When("admin navigates to the Leave List tab")
    public void admin_navigates_to_the_leave_list_tab() {
        leaveManagementPage.clickLeaveList();
    }
    @Then("the leave request appears with the status of Pending Approval")
    public void the_leave_request_appears_with_the_status_of_pending_approval() {
        leaveManagementPage.validateAdmApply();
    }

    @Then("the leave request does not have Actions of Approve or Reject")
    public void the_leave_request_does_not_have_actions_of_approve_or_reject() {
        leaveManagementPage.validateNoAction();
    }

    //TC12HK @LeaveAdm_12
    @When("admin clicks the Entitlements tab")
    public void admin_clicks_the_entitlements_tab() {
        leaveManagementPage.clickEntitlementsMenu();
    }
    @When("admin select Add Entitlement from the dropdown")
    public void admin_select_add_entitlement_from_the_dropdown() {
        leaveManagementPage.selectAddEntitlements();
    }
    @When("admin choose Multiple Employees")
    public void admin_choose_multiple_employees() {
        leaveManagementPage.selectMultipleEmployee();
    }
    @When("admin select a valid leave type {string}")
    public void admin_select_a_valid_leave_type(String arg) {
        leaveManagementPage.selectLeaveType();
        leaveManagementPage.selectCANPersonal();
    }
    @When("admin select a valid leave period {string}")
    public void admin_select_a_valid_leave_period(String arg) {
        leaveManagementPage.selectLeavePeriod();
    }
    @When("admin enter the number {string} of the entitlements")
    public void admin_enter_the_number_of_the_entitlements(String arg) {
        leaveManagementPage.inputEntitlements();
    }
    @When("admin clicks Save button")
    public void admin_clicks_save_button() {
       leaveManagementPage.clickSaveBtn();
    }

    @Then("the addition confirmation page is available")
    public void theAdditionConfirmationPageIsAvailable() {
        leaveManagementPage.validateUpdateEntitlement();
    }


    //TC13HK, @LeaveAdm_13
    @When("user clicks the Configure tab")
    public void user_clicks_the_configure_tab() {
        leaveManagementPage.clickConfigureMenu();
    }
    @When("select Leave Types from the dropdown")
    public void select_leave_types_from_the_dropdown() {
        leaveManagementPage.selectLeaveTypeConfi();
    }
    @When("clicks Add button")
    public void clicks_add_button() {
        leaveManagementPage.clickAddBtn();
    }

    @And("enter Jury - Duty as the name of the new Leave Type")
    public void enterJuryDutyAsTheNameOfTheNewLeaveType() {
        leaveManagementPage.addLeaveType();
    }

    @When("clicks on Save button")
    public void clicks_on_save_button() {
        leaveManagementPage.clickSaveBtnConfi();
    }

    @Then("appears in the list of available leave types for the employees")
    public void appears_in_the_list_of_available_leave_types_for_the_employees(){
       leaveManagementPage.validateNewLeaveType();
    }


    //TC14HK, @LeaveAdm_14
    @When("admin clicks the Reports tab")
    public void admin_clicks_the_reports_tab() {
        leaveManagementPage.clickReportsMenu();
    }
    @When("admin select Leave Entitlements and Usage Reports from the dropdown")
    public void admin_select_leave_entitlements_and_usage_reports_from_the_dropdown() {
        leaveManagementPage.selectLeaveEntAndUsgReport();
    }
    @When("admin clicks leave type in Generate For")
    public void admin_clicks_leave_type_in_generate_for() {
        leaveManagementPage.clickLeaveType();
    }

    @And("admin selects the leave period {string}")
    public void admin_selectsTheLeavePeriod(String arg) {
    leaveManagementPage.selectLeavePeriod();
    }

    @When("admin clicks on Generate button")
    public void admin_clicks_on_generate_button() {
       leaveManagementPage.clickGenerateButton();
    }
    @Then("the report displayed the specified employee's leave usage and balances for the specified leave period")
    public void the_report_displayed_the_specified_employee_s_leave_usage_and_balances_for_the_specified_leave_period() {
       leaveManagementPage.validateReport();
    }


/*
    //TC08HK, @NotTested
    @Given("the employee has sufficient leave balance")
    public void the_employee_has_sufficient_leave_balance() {

    }
    @When("user clicks the Assign Leave tab")
    public void user_clicks_the_assign_leave_tab() {

    }
    @When("selects an employee and leave type {string}")
    public void selects_an_employee_and_leave_type(String string) {

    }
    @When("enters valid leave date range {string} to {string}")
    public void enters_valid_leave_date_range_to(String string, String string2) {

    }
    @When("clicks Assign button")
    public void clicks_assign_button() {

    }
    @Then("the leave is successfully assigned")
    public void the_leave_is_successfully_assigned() {

    }
    @When("user navigates to the Leave List tab")
    public void user_navigates_to_the_leave_list_tab() {

    }
    @When("select Scheduled from the dropdown of the Show Leave With Status")
    public void select_scheduled_from_the_dropdown_of_the_show_leave_with_status() {

    }
    @When("clicks Search button")
    public void clicks_search_button() {

    }
    @Then("the assigned leave for the specified employee appears with a status of Scheduled")
    public void the_assigned_leave_for_the_specified_employee_appears_with_a_status_of_scheduled() {

    }

 */


}
