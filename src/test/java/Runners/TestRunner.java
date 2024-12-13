package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Path to your feature files
        glue = "Steps",  // Package where step definitions are stored
        tags = "Timesheet",  // Optional: can be used to run specific tags (e.g., @TimesheetSubmission)
        plugin = { "pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json" }, // Generates reports
        monochrome = true,  // Makes the console output more readable
        dryRun = true  // If true, it checks the feature and step definitions without actually running the tests
)
public class TestRunner {
    // No need for code here, as JUnit will run the tests
}
