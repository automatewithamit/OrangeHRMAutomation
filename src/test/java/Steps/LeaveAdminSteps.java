package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveAdminSteps {

    //Background
    @Given("user is on the OrangeHRM app")
    public void user_is_on_the_orange_hrm_app() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters valid username {string} and valid password {string}")
    public void user_enters_valid_username_and_valid_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is logged into the application")
    public void user_is_logged_into_the_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("navigates to the Leave Module")
    public void navigates_to_the_leave_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC06HK
    @Given("a leave request with the status Pending Approval exists in the Leave List tab")
    public void a_leave_request_with_the_status_pending_approval_exists_in_the_leave_list_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Leave List tab")
    public void user_clicks_the_leave_list_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("locates a leave request with the status Pending Approval and has actions Approve and Reject")
    public void locates_a_leave_request_with_the_status_pending_approval_and_has_actions_approve_and_reject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Approve button")
    public void clicks_approve_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request status changes from Pending Approval to Scheduled")
    public void the_leave_request_status_changes_from_pending_approval_to_scheduled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //TC08HK
    @Given("the employee has sufficient leave balance")
    public void the_employee_has_sufficient_leave_balance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Assign Leave tab")
    public void user_clicks_the_assign_leave_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects an employee and leave type {string}")
    public void selects_an_employee_and_leave_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enters valid leave date range {string} to {string}")
    public void enters_valid_leave_date_range_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Assign button")
    public void clicks_assign_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave is successfully assigned")
    public void the_leave_is_successfully_assigned() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user navigates to the Leave List tab")
    public void user_navigates_to_the_leave_list_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select Scheduled from the dropdown of the Show Leave With Status")
    public void select_scheduled_from_the_dropdown_of_the_show_leave_with_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Search button")
    public void clicks_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the assigned leave for the specified employee appears with a status of Sheduled")
    public void the_assigned_leave_for_the_specified_employee_appears_with_a_status_of_sheduled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    //TC10HK
    @Given("Admin has sufficient leave balance")
    public void admin_has_sufficient_leave_balance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Apply tab")
    public void user_clicks_the_apply_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects a valid leave type {string}")
    public void selects_a_valid_leave_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enter a valid date range {string} to {string}")
    public void enter_a_valid_date_range_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Apply button")
    public void clicks_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request is successfully submitted")
    public void the_leave_request_is_successfully_submitted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("admin navigates to the Leave List tab")
    public void admin_navigates_to_the_leave_list_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request appears with the status of Pending Approval")
    public void the_leave_request_appears_with_the_status_of_pending_approval() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request does not have Actions of Approve or Reject")
    public void the_leave_request_does_not_have_actions_of_approve_or_reject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC12HK
    @When("user clicks the Entitlements tab")
    public void user_clicks_the_entitlements_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select Add Entitlement from the dropdown")
    public void select_add_entitlement_from_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("choose Multiple Employees")
    public void choose_multiple_employees() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select a valid leave type {string}")
    public void select_a_valid_leave_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select a valid leave period {string}")
    public void select_a_valid_leave_period(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enter the number {string} of the entitlements")
    public void enter_the_number_of_the_entitlements(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Save button")
    public void clicks_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the addition confirmation page appears")
    public void the_addition_confirmation_page_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the page displays the updated balance for the matching employees")
    public void the_page_displays_the_updated_balance_for_the_matching_employees() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the option to confirm or cancel are available")
    public void the_option_to_confirm_or_cancel_are_available() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC13HK
    @When("user clicks the Configure tab")
    public void user_clicks_the_configure_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select Leave Types from the dropdown")
    public void select_leave_types_from_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Add button")
    public void clicks_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enter {string} as the name of the new Leave Type")
    public void enter_as_the_name_of_the_new_leave_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Yes button for the question Is Entitlement Situational")
    public void clicks_yes_button_for_the_question_is_entitlement_situational() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on Save button")
    public void clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the new leave type is successfully saved")
    public void the_new_leave_type_is_successfully_saved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("appears in the list of available leave types for the employees")
    public void appears_in_the_list_of_available_leave_types_for_the_employees() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC14HK
    @When("user clicks the Reports tab")
    public void user_clicks_the_reports_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select Leave Entitlements and Usage Reports from the dropdown")
    public void select_leave_entitlements_and_usage_reports_from_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Employee in Generate For")
    public void clicks_employee_in_generate_for() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enters the employee name")
    public void enters_the_employee_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects the leave period {string} to {string}")
    public void selects_the_leave_period_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on Generate button")
    public void clicks_on_generate_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the report displayed the specified employee's leave usage and balances for the specified leave period")
    public void the_report_displayed_the_specified_employee_s_leave_usage_and_balances_for_the_specified_leave_period() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
