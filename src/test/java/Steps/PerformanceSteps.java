package Steps;

import Pages.PerformancePage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import com.framework.web_elements.DropDown;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.framework.core.BrowserManager.getDriver;

public class PerformanceSteps extends CommonMethods {

    PerformancePage performancePage = new PerformancePage();

    //BACKGROUND STEPS
    @Given("the user is navigated to OrangeHRM login page")
    public void the_user_is_navigated_to_orangehrm_login_page() {
        getDriver().navigate().to(ConfigReader.read("url"));
    }

    @When("the user enters username value and password value")
    public void the_user_enters_username_and_password() {
        performancePage.enterLoginPassword();
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        performancePage.clickLoginButton();
    }

    @And("the user is successfully logged in")
    public void the_user_is_successfully_logged_in() {
        performancePage.dashboardValidation();
    }

    @Then("the user clicks Performance in navigation panel")
    public void the_user_clicks_performance_in_navigation_panel() {
        performancePage.clickPerformanceMenu();
    }

    //*****************************************************************************************

    //TC-01
    @When("the user clicks Manage Reviews")
    public void the_user_clicks_manage_reviews() {
        performancePage.clickManageReviewsMenu();
    }

    @When("the user clicks My Reviews from dropdown")
    public void the_user_clicks_my_reviews_from_dropdown() {
        getDriver().findElement(By.xpath("//a[text()='My Reviews']")).click();

    }

    @Then("user can successfully view My Reviews")
    public void user_can_successfully_view_my_reviews() {
        performancePage.myReviewsValidation();
    }

    //*****************************************************************************************

    //TC-02
    @When("the user clicks My Trackers")
    public void the_user_clicks_my_trackers() {
       performancePage.clickMyTrackersMenu();

    }

    @Then("the user can successfully view My Trackers")
    public void the_user_can_successfully_view_my_trackers() {
        performancePage.myTrackersValidation();
    }

    //*****************************************************************************************

    //TC-03

    @When("the user clicks on Configure")
    public void the_user_clicks_on_configure() {
      performancePage.clickConfigureMenu();
    }

    @When("the user clicks on KPIs from the dropdown")
    public void the_user_clicks_on_kp_is_from_the_dropdown() {
        getDriver().findElement(By.xpath("//a[text()='KPIs']")).click();
    }

    @When("the user clicks the Add button under Key Performance Indicators for Job Title")
    public void the_user_clicks_the_add_button_under_key_performance_indicators_for_job_title() throws InterruptedException {
       performancePage.clickAddKPIButton();
       Thread.sleep(5000);

    }

    @When("the user enters Key Performance Indicator Title")
    public void the_user_enters_key_performance_indicator_title() {
        performancePage.enterKPITitle();

    }

    @When("the user selects Job Title from the dropdown")
    public void the_user_selects_job_title_from_the_dropdown() {
      performancePage.selectJobTitleDB();
    }

    @When("the user clicks the Save button under Add Key Performance Indicator")
    public void the_user_clicks_the_save_button_under_add_key_performance_indicator() {
      performancePage.setKpiSaveButton();
    }

    @Then("the KPI is successfully saved")
    public void the_kpi_is_successfully_saved() {
        System.out.println("Successfully saved");
    }





}
