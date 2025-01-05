package Steps;

import Pages.DashboardPage;
import TestBase.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.management.Notification;
import javax.swing.*;
import java.time.Duration;
import java.util.List;

import static com.framework.constants.Constants.*;
import static com.framework.core.BrowserManager.getDriver;
import static org.testng.AssertJUnit.*;

public class DashboardSteps {
    //WebDriver driver = getDriver();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and(String username, String password) {

        getDriver().get(BASE_URL);


        WebElement usernameField = getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
        usernameField.clear();
        usernameField.sendKeys(USERNAME);

        WebElement passwordField = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);

        WebElement loginButton = getDriver().findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

    }

    @When("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() {
        dashboardPage.isRedirected();

    }

    @Then("the dashboard should display the header with the application logo")
    public void the_dashboard_should_display_the_header_with_the_application_logo() {
        dashboardPage.isLogoDisplayed();

    }

    @Then("the dashboard should display the user's profile information")
    public void the_dashboard_should_display_the_users_profile_information() {
        dashboardPage.isUserProfileDisplayed();

    }

    @Then("all widgets on the dashboard should be visible")
    public void all_widgets_on_the_dashboard_should_be_visible() {
        dashboardPage.isWidgetVisible();

    }

    //@Then("the navigation menu should be functional")
    //public void the_navigation_menu_should_be_functional() {
    //dashboardPage.isNavigationMenuFunctional();

    @Given("the navigational panel is in an expanded state")
    public void the_navigational_panel_is_in_an_expanded_state() {
         dashboardPage.isNavigationalPanelExpanded();
       // assertTrue("The navigational panel is not in an expanded state.", isExpanded);

    }

    @When("the user clicks the panel toggle button")
    public void the_user_clicks_the_panel_toggle_button() {
        dashboardPage.isPanelButtonClickable();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the navigational panel should collapse smoothly")
    public void the_navigational_panel_should_collapse_smoothly() {
        dashboardPage.isNavigationalPanelCollapsable();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the toggle button should remain visible")
    public void the_toggle_button_should_remain_visible() {
        dashboardPage.isButtonVisible();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}





