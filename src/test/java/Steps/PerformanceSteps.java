package Steps;

import Utils.CommonMethods;
import com.orange.pages.DashboardPage;
import com.orange.pages.PerformancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PerformanceSteps extends CommonMethods {

    public static WebDriver driver;

    //BACKGROUND STEPS
    @Given("the user is navigated to OrangeHRM login page")
    public void the_user_is_navigated_to_orangehrm_login_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("url");
    }

    @When("the user enters username value and password value")
    public void the_user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("userName");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
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
