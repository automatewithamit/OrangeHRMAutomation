package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.framework.core.BrowserManager.getDriver;

public class PerformanceSteps extends CommonMethods {


    //BACKGROUND STEPS
    @Given("the user is navigated to OrangeHRM login page")
    public void the_user_is_navigated_to_orangehrm_login_page() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().window().maximize();
        getDriver().get("url");
    }

    @When("the user enters username value and password value")
    public void the_user_enters_username_and_password() {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("userName");
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("password");
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        getDriver().findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @And("the user is successfully logged in")
    public void the_user_is_successfully_logged_in() {
        // Verify user is logged in
        //Assert.assertTrue();
    }

    @Then("the user clicks Performance in navigation panel")
    public void the_user_clicks_performance_in_navigation_panel() {
        // Click on the Performance navigation panel
        System.out.println("Clicking on the Performance navigation panel...");
        // Add logic to locate and click the Performance navigation item
    }

    //*****************************************************************************************
}
