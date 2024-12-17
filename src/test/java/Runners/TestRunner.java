package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "Steps",                // Package containing step definitions
        plugin = {
                "pretty",                        // Prints Gherkin steps in console
                "html:target/cucumber-reports/Cucumber.html", // HTML report
                "json:target/cucumber-reports/Cucumber.json", // JSON report
                "junit:target/cucumber-reports/Cucumber.xml"  // JUnit report
        },
        monochrome = true,                        // Makes console output readable
        dryRun = false ,                          // Checks mapping between feature files and step definitions
        tags = "@directory"                       // Run scenarios tagged with @SmokeTest
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // Parallel execution support
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
