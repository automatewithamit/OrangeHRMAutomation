package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PimSteps {
    WebDriver driver;

    @Given("user is navigated to OrangeHRM application")
    public void user_is_navigated_to_orange_hrm_application() {
    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
    }

    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
    }

    @When("user clicks on Add Employee")
    public void user_clicks_on_add_employee() {
    }

    @When("user enters firstName and middleName and lastName")
    public void user_enters_first_name_and_middle_name_and_last_name() {
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
    }

    @Then("user should see the new employee under employee list")
    public void user_should_see_the_new_employee_under_employee_list() {
    }

    @Given("the user is on the employee list page")
    public void the_user_is_on_the_employee_list_page() {
    }

    @When("the user enters {string} in the search field")
    public void the_user_enters_in_the_search_field(String string) {
    }

    @When("the user clicks the search button")
    public void the_user_clicks_the_search_button() {
    }

    @Then("employee name should appear in the search results")
    public void employee_name_should_appear_in_the_search_results() {
    }

    @Then("the user should see the details of the employee")
    public void the_user_should_see_the_details_of_the_employee() {
    }

    @When("user search employee by {string}")
    public void user_search_employee_by(String string) {
    }

    @Then("user should see employee name and info in the search results")
    public void user_should_see_employee_name_and_info_in_the_search_results() {
    }

    @Given("{string} exists in the employee list")
    public void exists_in_the_employee_list(String string) {
    }

    @When("user select {string} and click {string}")
    public void user_select_and_click(String string, String string2) {
    }

    @When("user update employee's address to {string}")
    public void user_update_employee_s_address_to(String string) {
    }

    @When("user click {string}")
    public void user_click(String string) {
    }

    @Then("the address should be updated for {string}")
    public void the_address_should_be_updated_for(String string) {
    }

    @When("user confirm the deletion")
    public void user_confirm_the_deletion() {
    }

    @Then("{string} should not appear in the employee list")
    public void should_not_appear_in_the_employee_list(String string) {
    }

    @When("user select {string}")
    public void user_select(String string) {
    }

    @When("user upload a document named {string}")
    public void user_upload_a_document_named(String string) {
    }

    @When("user clicks {string}")
    public void user_clicks(String string) {
    }

    @Then("{string} should be listed in the documents section for {string}")
    public void should_be_listed_in_the_documents_section_for(String string, String string2) {
    }

    @Then("user should be able to add {string}")
    public void user_should_be_able_to_add(String string) {
    }

    @Then("salary should be added for {string}")
    public void salary_should_be_added_for(String string) {
    }

    @Given("the user is on the employee details page for {string}")
    public void the_user_is_on_the_employee_details_page_for(String string) {
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
    }

    @When("the user updates the phone number to {string}")
    public void the_user_updates_the_phone_number_to(String string) {
    }

    @When("the user updates the email address to {string}")
    public void the_user_updates_the_email_address_to(String string) {
    }

    @Then("the contact information for the employee should be updated successfully")
    public void the_contact_information_for_the_employee_should_be_updated_successfully() {
    }

    @Then("the user should see a confirmation message {string}")
    public void the_user_should_see_a_confirmation_message(String string) {
    }

    @When("user assign {string} as a Manager")
    public void user_assign_as_a_manager(String string) {
    }

    @Then("{string} should be listed as a Manager for {string}")
    public void should_be_listed_as_a_manager_for(String string, String string2) {
    }

    @When("user generate the {string}")
    public void user_generate_the(String string) {
    }

    @Then("the report should display all employees with their details")
    public void the_report_should_display_all_employees_with_their_details() {
    }
}
