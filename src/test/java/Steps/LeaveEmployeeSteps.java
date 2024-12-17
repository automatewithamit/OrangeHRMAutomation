package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveEmployeeSteps {

    //Background
    @Given("user is on the OrangeHRM app")
    public void user_is_on_the_orange_hrm_app() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
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

    //TC01HK
    @Given("user has sufficient leave entitlement balance")
    public void user_has_sufficient_leave_entitlement_balance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Apply tab")
    public void user_clicks_the_apply_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects a valid Leave Type {string}")
    public void selects_a_valid_leave_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("enters a valid date range {string}")
    public void enters_a_valid_date_range(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Apply button")
    public void clicks_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request is successfully saved")
    public void the_leave_request_is_successfully_saved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user navigates to the My Leave tab")
    public void user_navigates_to_the_my_leave_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave request status is displayed as Pending Approval")
    public void the_leave_request_status_is_displayed_as_pending_approval() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC03HK
    @Given("user has a Scheduled leave request")
    public void user_has_a_scheduled_leave_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the My Leave tab")
    public void user_clicks_the_my_leave_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("locates a leave request with the status Scheduled")
    public void locates_a_leave_request_with_the_status_scheduled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Cancel button")
    public void clicks_cancel_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the leave status changes from Scheduled to Cancelled")
    public void the_leave_status_changes_from_scheduled_to_cancelled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //TC04HK
    @Given("user's entitlements have been configured by the Admin")
    public void user_s_entitlements_have_been_configured_by_the_admin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the Entitlements tab")
    public void user_clicks_the_entitlements_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select My Entitlements from the dropdown")
    public void select_my_entitlements_from_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system displays entitlements balances and validity dates for each leave type")
    public void the_system_displays_entitlements_balances_and_validity_dates_for_each_leave_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //@TC05HT
    @When("user clicks on the Reports tab")
    public void user_clicks_on_the_reports_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects My Leave Entitlements and Usage Report from the dropdown")
    public void selects_my_leave_entitlements_and_usage_report_from_the_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selects any Leave Period {string}")
    public void selects_any_leave_period(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks Generate button")
    public void clicks_generate_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the report displays leave balance, usage, and remaining entitlement for the selected period")
    public void the_report_displays_leave_balance_usage_and_remaining_entitlement_for_the_selected_period() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
