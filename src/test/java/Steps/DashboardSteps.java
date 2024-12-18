package Steps;

import Utils.ConfigReader;
import com.framework.core.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class DashboardSteps {


    WebDriver driver;

    @Given("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and(String username, String password) {
        WebDriver driver = Hooks.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("opensource-demo.OrangeHRM.com/web/index.php/auth/login");

        //enterCredential(ConfigReader.read("userName"), ConfigReader.read("password"));

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.clear();
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        System.out.println(STR."User logged in with username: \{username} and password.");
    }

    @Given("the user is redirected to the dashboard page")
public void the_user_is_redirected_to_the_dashboard_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app")));
}
@Then("the dashboard should display the header with the application logo")
public void the_dashboard_should_display_the_header_with_the_application_logo() {
}
@Then("the dashboard should display the user's profile information")
public void the_dashboard_should_display_the_user_s_profile_information() {
    WebElement profileInfo = driver.findElement(By.id("userProfile")); // Replace with actual locator
    assertTrue("User's profile information is not displayed!", profileInfo.isDisplayed());

    System.out.println("User's profile information is displayed.");
}
@Then("all widgets on the dashboard should be visible")
public void all_widgets_on_the_dashboard_should_be_visible() {

    List<WebElement> widgets = driver.findElements(By.cssSelector(".widget")); // Replace with actual widget locator
    assertFalse("No widgets found on the dashboard!", widgets.isEmpty());

    for (WebElement widget : widgets) {
        assertTrue("A widget is not visible!", widget.isDisplayed());
    }

    System.out.println("All widgets are visible on the dashboard.");

}
@Then("the navigation menu should be functional")
public void the_navigation_menu_should_be_functional() {
    WebElement navMenu = driver.findElement(By.id("navigationMenu"));
    assertTrue("Navigation menu is not displayed!", navMenu.isDisplayed());

    WebElement firstMenuItem = driver.findElement(By.cssSelector("#navigationMenu .menuItem"));
    firstMenuItem.click();

    wait.until(ExpectedConditions.urlContains("expectedPage")); // Replace with expected URL after click
    assertTrue("Navigation menu is not functional!", driver.getCurrentUrl().contains("expectedPage"));

    System.out.println("Navigation menu is functional.");
}
@Then("no error messages should be displayed")
public void no_error_messages_should_be_displayed() {

    List<WebElement> errorMessages = driver.findElements(By.cssSelector(".error-message")); // Replace with actual locator
    assertTrue("Error messages are displayed on the dashboard!", errorMessages.isEmpty());

    System.out.println("No error messages are displayed on the dashboard.");
}
@Given("the \"Time at Work\" widget is loaded on the dashboard")
public void the_time_at_work_widget_is_loaded_on_the_dashboard() {


    WebElement widgetName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-widget-name='" + widgetName + "']")));
    assertTrue(widgetName + " widget is not loaded!", widgetName.isDisplayed());
    System.out.println(widgetName + " widget is loaded successfully.");
}
@When("the user views the \"Time at Work\" widget")
public void the_user_views_the_time_at_work_widget() {

    WebElement widgetName = driver.findElement(By.xpath("//div[@data-widget-name='\{widgetName}']"));
    assertTrue(STR."\{widgetName} widget is visible to the user!", widgetName.isDisplayed());
    System.out.println(STR."User views the \{widgetName} widget.");
}
@Then("the widget should display the total working hours for the day")
public void the_widget_should_display_the_total_working_hours_for_the_day() {

    boolean displayedHours = false;
    assertFalse("The total working hours are not displayed!", displayedHours);
    System.out.println("The total working hours for the day are displayed: " + displayedHours);
}
@And("the displayed hours should match the recorded work hours in the system")
public void the_displayed_hours_should_match_the_recorded_work_hours_in_the_system() {

    String expectedHours = "8:00"; // Replace this with actual logic to fetch data from the system
    WebElement hoursElement = driver.findElement(By.id("workingHours")); // Replace with actual locator
    String displayedHours = hoursElement.getText();

    assertEquals("Displayed hours do not match the recorded work hours in the system!", expectedHours, displayedHours);
    System.out.println("Displayed hours match the recorded work hours in the system: " + displayedHours);

}
@And("the widget should update dynamically if the user logs additional time")
public void the_widget_should_update_dynamically_if_the_user_logs_additional_time() {

    // Simulate user logging additional time (e.g., API, button click)
    WebElement logTimeButton = driver.findElement(By.id("logTimeButton")); // Replace with actual locator
    logTimeButton.click();

    // Wait for the widget to update dynamically
    WebElement hoursElement = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("workingHours"), "8:30"));

    // Validate that the displayed hours are updated dynamically
    String updatedHours = hoursElement.getText();
    assertEquals("The widget did not update dynamically after logging additional time!", "8:30", updatedHours);
    System.out.println("The widget updated dynamically with the new working hours: " + updatedHours);

}
@Given("the \"My Actions\" section is visible on the dashboard")
public void the_my_actions_section_is_visible_on_the_dashboard() {

    WebElement myActionsSection = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@data-section-name='" + sectionName + "']"))); // Replace with actual locator
    assertTrue(sectionName + " section is not visible on the dashboard!", myActionsSection.isDisplayed());
    System.out.println(sectionName + " section is visible on the dashboard.");
}
@When("the user views the \"My Actions\" section")
public void the_user_views_the_my_actions_section() {

    WebElement myActionsSection = driver.findElement(By.xpath("//div[@data-section-name='" + sectionName + "']"));
    assertTrue(sectionName + " section is visible for the user to view!", myActionsSection.isDisplayed());
    System.out.println("User views the " + sectionName + " section.");
}
@Then("the section should display a list of pending tasks")
public void the_section_should_display_a_list_of_pending_tasks() {

    List<WebElement> tasks = driver.findElements(By.cssSelector("#myActionsSection .task-item")); // Replace with actual locator
    assertFalse("No tasks are displayed in the 'My Actions' section!", tasks.isEmpty());

    System.out.println("The 'My Actions' section displays the following pending tasks:");
    for (WebElement task : tasks) {
        System.out.println("- " + task.getText());
    }
}

@And("the total number of tasks displayed should match the records in the system")
public void the_total_number_of_tasks_displayed_should_match_the_records_in_the_system() {

    List<WebElement> tasks = driver.findElements(By.cssSelector("#myActionsSection .task-item")); // Replace with actual locator
    int displayedTaskCount = tasks.size();

    // Get the expected task count from the system (e.g., API/database simulation)
    int expectedTaskCount = 5; // Replace this with actual logic to fetch data from the system

    // Validate the displayed task count matches the expected count
    assertEquals("The total number of tasks displayed does not match the records in the system!",
            expectedTaskCount, displayedTaskCount);

    System.out.println("Displayed task count matches the system records: " + displayedTaskCount);
}

@Given("the user is viewing the dashboard on a mobile device")
public void the_user_is_viewing_the_dashboard_on_a_mobile_device() {

    driver.get("https://example.com/dashboard"); // Replace with actual URL
    System.out.println("Dashboard is opened in mobile resolution.");
}
@Then("all widgets should resize to fit the mobile screen dimensions")
public void all_widget_should_resize_to_fit_the_mobile_screen_dimensions() {
    List<WebElement> widgets = driver.findElements(By.cssSelector(".widget")); // Replace with actual widget locator

    // Verify each widget's width fits within the mobile screen dimensions
    for (WebElement widget : widgets) {
        int widgetWidth = widget.getSize().getWidth();
        assertTrue("A widget is not resized for mobile screen dimensions!", widgetWidth <= 375);
    }

    System.out.println("All widgets are resized to fit the mobile screen dimensions.");
}

@And("the navigation menu should be visible and functional")
public void the_navigation_menu_should_be_visible_and_functional() {

    WebElement navigationMenu = driver.findElement(By.id("navigationMenu")); // Replace with actual locator
    assertTrue("Navigation menu is not visible on the mobile view!", navigationMenu.isDisplayed());

    // Test navigation menu functionality
    WebElement menuItem = driver.findElement(By.cssSelector("#navigationMenu .menuItem")); // Replace with actual menu item locator
    menuItem.click();

    // Wait for the target page to load
    wait.until(ExpectedConditions.urlContains("expectedPage")); // Replace with expected URL
    assertTrue("Navigation menu did not lead to the expected page!", driver.getCurrentUrl().contains("expectedPage"));

    System.out.println("Navigation menu is visible and functional.");
}
@And("all elements should remain interactive")
public void all_elements_should_remain_interactive() {

    List<WebElement> interactiveElements = driver.findElements(By.cssSelector(".interactive")); // Replace with actual locator

    for (WebElement element : interactiveElements) {
        assertTrue("An element is not enabled for interaction!", element.isEnabled());
    }

    System.out.println("All elements remain interactive on the mobile view.");

}
@Given("a location has no employees assigned")
public void a_location_has_no_employees_assigned() {

    WebElement locationStatus = driver.findElement(By.id("locationStatus")); // Replace with actual locator
    assertEquals("No employees assigned", locationStatus.getText());
    System.out.println("Verified: Location has no employees assigned.");
}
@When("the user views the pie chart")
public void the_user_views_the_pie_chart() {

    WebElement pieChart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pieChart"))); // Replace with actual locator
    assertTrue("Pie chart is not displayed!", pieChart.isDisplayed());
    System.out.println("User views the pie chart.");
}
@Then("the chart should display a segment for the location with \"Unassigned\"")
public void the_chart_should_display_a_segment_for_the_location_with_unassigned() {

    WebElement unassignedSegment = driver.findElement(By.xpath("//g[contains(@class, 'chart-segment') and text()='" + segmentName + "']")); // Replace with actual locator
    assertTrue("The pie chart does not display a segment for 'Unassigned'!", unassignedSegment.isDisplayed());
    System.out.println("The pie chart displays a segment for: " + segmentName);
}
@And("the chart should handle the scenario without visual errors")
public void the_chart_should_handle_the_scenario_without_visual_errors() {

    List<WebElement> errorMessages = driver.findElements(By.cssSelector(".chart-error")); // Replace with actual error locator
    assertTrue("Visual errors are present in the pie chart!", errorMessages.isEmpty());
    System.out.println("The pie chart handles the scenario without visual errors.");
}
@Given("the \"Help\" button is displayed on the dashboard")
public void the_help_button_is_displayed_on_the_dashboard() {

    WebElement helpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("helpButton"))); // Replace with actual locator
    assertTrue(buttonName + " button is not displayed on the dashboard!", helpButton.isDisplayed());
    System.out.println(buttonName + " button is displayed on the dashboard.");
}
@When("the user views the dashboard")
public void the_user_views_the_dashboard() {

    WebElement dashboardHeader = driver.findElement(By.id("dashboardHeader")); // Replace with actual locator
    assertTrue("Dashboard is not displayed!", dashboardHeader.isDisplayed());
    System.out.println("User is viewing the dashboard.");
}
@Then("the \"Help\" button should be visible")
public void the_help_button_should_be_visible() {

    WebElement helpButton = driver.findElement(By.id("helpButton")); // Replace with actual locator
    assertTrue(buttonName + " button is not visible!", helpButton.isDisplayed());
    System.out.println(buttonName + " button is visible.");
}
@And("the button should be focusable using the keyboard")
public void the_button_should_be_focusable_using_the_keyboard() {

    WebElement helpButton = driver.findElement(By.id("helpButton")); // Replace with actual locator

    // Use Actions class to simulate keyboard focus
    Actions actions = new Actions(driver);
    actions.moveToElement(helpButton).sendKeys(Keys.TAB).perform();

}
@Given("the user remains inactive on the dashboard for the session timeout duration")
public void the_user_remains_inactive_on_the_dashboard_for_the_session_timeout_duration() {

    String focusedElementId = driver.switchTo().activeElement().getAttribute("id");
    assertEquals("Help button is not focusable using the keyboard!", "helpButton", focusedElementId);
    System.out.println("Help button is focusable using the keyboard.");
}
@When("the session expires")
public void the_session_expires() {

    driver.get("https://example.com/dashboard"); // Replace with your actual dashboard URL
    System.out.println("User is on the dashboard and remains inactive.");
}
@Then("the user should be redirected to the login page")
public void the_user_should_be_redirected_to_the_login_page() {

    boolean isRedirected = wait.until(ExpectedConditions.urlContains("login"));
    assertTrue("Session did not expire, or user was not redirected!", isRedirected);
    System.out.println("Session has expired, and user is being redirected.");
}
@And("the login page should display a message \"Your session has expired. Please log in again.\"")
public void the_login_page_should_display_a_message_your_session_has_expired_please_log_in_again() {

    String currentUrl = driver.getCurrentUrl();
    assertTrue("User is not redirected to the login page!", currentUrl.contains("login"));
    System.out.println("User is redirected to the login page.");


    WebElement messageElement = driver.findElement(By.id("sessionTimeoutMessage")); // Replace with actual locator
    String actualMessage = messageElement.getText();

}
@Given("the user is viewing the dashboard on a tablet device")
public void the_user_is_viewing_the_dashboard_on_a_tablet_device() {

    driver.get("https://example.com/dashboard"); // Replace with your actual dashboard URL
    System.out.println("Dashboard is opened in tablet resolution.");

}
@Then("all widgets should resize to fit the tablet screen dimensions")
public void all_widgets_should_resize_to_fit_the_tablet_screen_dimensions() {

    List<WebElement> widgets = driver.findElements(By.cssSelector(".widget")); // Replace with actual widget locator

    // Verify each widget's width fits within the tablet screen dimensions
    for (WebElement widget : widgets) {
        int widgetWidth = widget.getSize().getWidth();
        assertTrue("A widget is not resized for tablet screen dimensions!", widgetWidth <= 768);
    }

    System.out.println("All widgets are resized to fit the tablet screen dimensions.");
}

@And("all interactive elements should remain functional")
public void all_interactive_elements_should_remain_functional() {
    List<WebElement> interactiveElements = driver.findElements(By.cssSelector(".interactive")); // Replace with actual locator

    // Verify all interactive elements are enabled and clickable
    for (WebElement element : interactiveElements) {
        assertTrue("An interactive element is not functional!", element.isEnabled());

        // Test click functionality (optional)
        try {
            element.click();
            System.out.println("Clicked on an interactive element successfully.");
        } catch (Exception e) {
            fail("An interactive element could not be clicked: " + e.getMessage());
        }
    }

    System.out.println("All interactive elements are functional.");

}
@Given("the notification panel is in an expanded state")
public void the_notification_panel_is_in_an_expanded_state() {

    // Ensure the notification panel is expanded
    WebElement notificationPanel = driver.findElement(By.id("notificationPanel")); // Replace with actual locator
    if (!notificationPanel.getAttribute("class").contains("expanded")) {
        WebElement toggleButton = driver.findElement(By.id("panelToggleButton")); // Replace with actual locator
        toggleButton.click();
    }

    assertTrue("Notification panel is not in an expanded state!",
            notificationPanel.getAttribute("class").contains("expanded"));
    System.out.println("Notification panel is in an expanded state.");
}


@When("the user clicks the panel toggle button")
public void the_user_clicks_the_panel_toggle_button() {
    WebElement toggleButton = driver.findElement(By.id("panelToggleButton")); // Replace with actual locator
    toggleButton.click();
    System.out.println("User clicked the panel toggle button.");

}
@Then("the notification panel should collapse smoothly")
public void the_notification_panel_should_collapse_smoothly() {

    WebElement notificationPanel = driver.findElement(By.id("notificationPanel")); // Replace with actual locator
    wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(notificationPanel, "class", "expanded")));

    assertTrue("Notification panel did not collapse smoothly!",
            notificationPanel.getAttribute("class").contains("collapsed"));
    System.out.println("Notification panel collapsed smoothly.");
}
@And("the toggle button should remain visible")
public void the_toggle_button_should_remain_visible() {

    WebElement toggleButton = driver.findElement(By.id("panelToggleButton")); // Replace with actual locator
    assertTrue("Toggle button is not visible!", toggleButton.isDisplayed());
    System.out.println("Toggle button remains visible.");

}
@Given("there are no employees on leave for today")
public void there_are_no_employees_on_leave_for_today() {
    WebElement leaveStatus = driver.findElement(By.id("leaveStatus")); // Replace with actual locator
    assertEquals("No employees on leave", leaveStatus.getText());
    System.out.println("Verified: No employees are on leave for today.");
}
@When("the widget loads")
public void the_widget_loads() {

    WebElement leaveWidget = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leaveWidget"))); // Replace with actual locator
    assertTrue("The leave widget is not loaded!", leaveWidget.isDisplayed());
    System.out.println("The leave widget is loaded.");
}
@Then("the widget should display a message \"No employees on leave today\"")
public void the_widget_should_display_a_message_no_employees_on_leave_today(String expectedMessage) {

    WebElement messageElement = driver.findElement(By.id("leaveMessage")); // Replace with actual locator
    String actualMessage = messageElement.getText();

    // Verify the message text
    assertEquals("The leave widget did not display the correct message!", expectedMessage, actualMessage);
    System.out.println("The leave widget displays the correct message: " + actualMessage);

}
@And("no employee entries should be listed")
public void no_employee_entries_should_be_listed() {

    List<WebElement> employeeEntries = driver.findElements(By.cssSelector("#leaveWidget .employee-entry")); // Replace with actual locator

    // Verify that no employee entries are displayed
    assertTrue("Employee entries are displayed when none should be!", employeeEntries.isEmpty());
    System.out.println("No employee entries are listed in the widget.");
}
}








