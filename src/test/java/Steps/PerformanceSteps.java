package Steps;

import Pages.PerformancePage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import com.framework.web_elements.DropDown;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

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
        performancePage.setManageReviewsDB("My Reviews");
    }

    @Then("user can successfully view My Reviews")
    public void user_can_successfully_view_my_reviews() {
     performancePage.myReviewsValidation();
    }

}
