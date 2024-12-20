package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;



public class TimesheetsSteps {
    //Page Objects
    // Background Steps
    @Given("the user is logged into OrangeHRM with the following credentials:")
    public void givenUserIsLoggedIntoOrangeHRMWithCredentials(DataTable credentials) {
        String username = credentials.cell(1, 0);
        String password = credentials.cell(1, 1);

    }

//    @Given("the system is functional and accessible")
//    public void givenSystemIsFunctionalAndAccessible() {
//
//    }
//
//
//    @When("the employee navigates to {string}")
//    public void whenEmployeeNavigatesTo(String page) {
//
//    }
//
//    @When("the employee updates the timesheet hours")
//    public void whenEmployeeUpdatesTimesheetHours() {
//
//    }
//
//    @When("the employee submits the timesheet for approval")
//    public void whenEmployeeSubmitsTimesheetForApproval() {
//
//    }
//
//    @Then("the timesheet should be submitted successfully")
//    public void thenTimesheetShouldBeSubmittedSuccessfully() {
//
//    }
//
//    @Then("the status should update to {string}")
//    public void thenStatusShouldUpdateTo(String status) {
//
//    }
//
//    @When("the manager navigates to {string}")
//    public void whenManagerNavigatesTo(String page) {
//
//    }
//
//    @When("the manager opens a pending timesheet")
//    public void whenManagerOpensPendingTimesheet() {
//
//    }
//
//    @When("the manager approves the timesheet")
//    public void whenManagerApprovesTimesheet() {
//
//    }
//
//    @Then("the timesheet status should update to {string}")
//    public void thenTimesheetStatusShouldUpdateTo(String status) {
//
//    }
//
//    @Then("a notification should be sent to the employee")
//    public void thenNotificationShouldBeSentToEmployee() {
//
//    }
//
//    @When("the manager navigates to the {string} section")
//    public void whenManagerNavigatesToSection(String section) {
//
//    }
//
//    @When("the manager selects a pending timesheet for review")
//    public void whenManagerSelectsPendingTimesheetForReview() {
//
//    }
//
//    @When("the manager rejects the timesheet with a reason")
//    public void whenManagerRejectsTimesheetWithReason() {
//
//    }
//
//    @Then("the timesheet status should change to {string}")
//    public void thenTimesheetStatusShouldChangeTo(String status) {
//
//    }
//
//    @Then("the manager’s comments should be sent to the employee")
//    public void thenManagersCommentsShouldBeSentToEmployee() {
//
//    }
//
//    @When("the employee navigates to the {string} page")
//    public void whenEmployeeNavigatesToPage(String page) {
//
//    }
//
//    @When("the employee inputs their punch-in and punch-out times")
//    public void whenEmployeeInputsPunchInAndPunchOutTimes() {
//
//    }
//
//    @When("submits the punch times by clicking {string}")
//    public void whenEmployeeSubmitsPunchTimesByClicking(String button) {
//
//    }
//
//    @Then("the system should successfully save the attendance record")
//    public void thenSystemShouldSuccessfullySaveAttendanceRecord() {
//
//    }
//
//    @When("the employee accesses the {string} section")
//    public void whenEmployeeAccessesSection(String section) {
//
//    }
//
//    @When("chooses a specific date range")
//    public void whenEmployeeChoosesSpecificDateRange() {
//
//    }
//
//    @Then("the system should display the attendance records for the selected range correctly")
//    public void thenSystemShouldDisplayAttendanceRecordsCorrectly() {
//
//    }
//
//    @When("the manager accesses the {string} section")
//    public void whenManagerAccessesSection(String section) {
//
//    }
//
//    @When("searches for a specific employee")
//    public void whenManagerSearchesForSpecificEmployee() {
//
//    }
//
//    @When("selects a desired date range")
//    public void whenManagerSelectsDesiredDateRange() {
//
//    }
//
//    @Then("the attendance records for that employee should be displayed accurately")
//    public void thenAttendanceRecordsForEmployeeShouldBeDisplayedAccurately() {
//
//
//    }
//
//    @When("the admin accesses the {string} section")
//    public void whenAdminAccessesSection(String section) {
//
//    }
//
//    @When("modifies the attendance settings {string}")
//    public void whenAdminModifiesAttendanceSettings(String setting) {
//
//    }
//
//    @When("applies the changes")
//    public void whenAdminAppliesChanges() {
//
//    }
//
//    @Then("the attendance settings should be successfully updated")
//    public void thenAttendanceSettingsShouldBeSuccessfullyUpdated() {
//
//    }
//
//
//    @When("chooses a specific project")
//    public void whenManagerChoosesSpecificProject() {
//    }
//
//    @When("generates the corresponding report")
//    public void whenManagerGeneratesReport() {
//
//    }
//
//    @Then("the project report should be displayed accurately")
//    public void thenProjectReportShouldBeDisplayedAccurately() {
//
//
//    }
//
//    @When("the manager accesses the {string} section")
//    public void whenManagersAccessesSection(String section) {
//
//    }
//
//    @When("selects an employee and specifies a date range")
//    public void whenManagerSelectsEmployeeAndSpecifiesDateRange() {
//
//    }
//
//    @When("generates the corresponding report")
//    public void whenManagerGeneratesReports() {
//
//    }
//
//    @Then("the employee report should be displayed correctly")
//    public void thenEmployeeReportShouldBeDisplayedCorrectly() {
//    }
//
//    @When("the manager accesses the {string} section")
//    public void whenTheManagerAccessesSection(String section) {
//
//    }
//
//    @When("applies the relevant filters")
//    public void whenManagerAppliesRelevantFilters() {
//
//    }
//
//    @When("generates the summary report")
//    public void whenManagerGeneratesSummaryReport() {
//
//    }
//
//    @Then("the generated attendance summary should be displayed correctly")
//    public void thenGeneratedAttendanceSummaryShouldBeDisplayedCorrectly() {
//
//    }

}