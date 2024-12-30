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
import static org.testng.AssertJUnit.*;

public class DashboardSteps {
    WebDriver driver;
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and() {
        WebDriver driver = Hooks.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(BASE_URL);


        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.clear();
        usernameField.sendKeys(USERNAME);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);

        WebElement loginButton = driver.findElement(By.id("loginButton"));
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

    @Then("the navigation menu should be functional")
    public void the_navigation_menu_should_be_functional() {
        dashboardPage.isNavigationMenuFunctional();

    }
}
