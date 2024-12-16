package Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class RecruitmentSteps {
    WebDriver driver;
    @Given("I am on the login page {string}")
    public void iAmOnTheLoginPage(String url) {
        driver.get(url);
    }

    @When("I log in with username {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("loginButton")).click();
    }



    @Given("I navigate to the {string} menu")
    public void iNavigateToTheMenu(String menu) {
        driver.findElement(By.xpath("//span[text()='" + menu + "']")).click();
    }

    @When("I apply the filter by job title {string}")
    public void iApplyTheFilterByJobTitle(String jobTitle) {
        driver.findElement(By.name("jobTitleFilter")).sendKeys(jobTitle);
    }

    @When("I click the {string} button")
    public void iClickTheButton(String button) {
        driver.findElement(By.xpath("//button[text()='" + button + "']")).click();
    }

    @Then("I should see a list of candidates matching the job title {string}")
    public void iShouldSeeAListOfCandidatesMatchingTheJobTitle(String jobTitle) {
        WebElement resultsTable = driver.findElement(By.id("candidatesTable"));
        Assert.assertTrue(resultsTable.getText().contains(jobTitle));
    }

    @When("I fill in the candidate details:")
    public void iFillInTheCandidateDetails(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMaps(String.class, String.class).get(0);
        driver.findElement(By.name("name")).sendKeys(data.get("Name"));
        driver.findElement(By.name("email")).sendKeys(data.get("Email"));
        driver.findElement(By.name("jobTitle")).sendKeys(data.get("Job Title"));
    }

    @Then("I should see a confirmation message {string}")
    public void iShouldSeeAConfirmationMessage(String message) {
        WebElement confirmation = driver.findElement(By.id("confirmationMessage"));
        Assert.assertEquals(message, confirmation.getText());
    }

    @Then("the candidate {string} should appear in the candidate list")
    public void theCandidateShouldAppearInTheCandidateList(String candidateName) {
        WebElement table = driver.findElement(By.id("candidateTable"));
        Assert.assertTrue(table.getText().contains(candidateName));
    }
    @Given("the candidate {string} exists")
    public void theCandidateExists(String candidateName) {
        Assert.assertTrue(driver.findElement(By.id("candidateTable")).getText().contains(candidateName));
    }

    @When("I locate the candidate {string}")
    public void iLocateTheCandidate(String candidateName) {
        driver.findElement(By.xpath("//td[text()='" + candidateName + "']/..//button[text()='Delete']")).click();
    }

    @When("I confirm the deletion")
    public void iConfirmTheDeletion() {
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }

    @Then("the candidate {string} should no longer appear in the candidate list")
    public void theCandidateShouldNoLongerAppearInTheCandidateList(String candidateName) {
        WebElement table = driver.findElement(By.id("candidateTable"));
        Assert.assertFalse(table.getText().contains(candidateName));
    }
    @When("I apply the filter by status {string}")
    public void iApplyTheFilterByStatus(String status) {
        driver.findElement(By.name("statusFilter")).sendKeys(status);
    }

    @Then("I should see a list of vacancies matching the status {string}")
    public void iShouldSeeAListOfVacanciesMatchingTheStatus(String status) {
        WebElement resultsTable = driver.findElement(By.id("vacanciesTable"));
        Assert.assertTrue(resultsTable.getText().contains(status));
    }
    @When("I fill in the vacancy details:")
    public void iFillInTheVacancyDetails(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMaps(String.class, String.class).get(0);
        driver.findElement(By.name("jobTitle")).sendKeys(data.get("Job Title"));
        driver.findElement(By.name("department")).sendKeys(data.get("Department"));
        driver.findElement(By.name("hiringManager")).sendKeys(data.get("Hiring Manager"));
    }
    @When("I click the {string} button for the vacancy {string}")
    public void iClickTheButtonForTheVacancy(String button, String vacancyName) {
        driver.findElement(By.xpath("//td[text()='" + vacancyName + "']/..//button[text()='" + button + "']")).click();
    }

    @When("I update the details to:")
    public void iUpdateTheDetailsTo(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMaps(String.class, String.class).get(0);
        driver.findElement(By.name("jobTitle")).clear();
        driver.findElement(By.name("jobTitle")).sendKeys(data.get("Job Title"));
        driver.findElement(By.name("department")).clear();
        driver.findElement(By.name("department")).sendKeys(data.get("Department"));
        driver.findElement(By.name("hiringManager")).clear();
        driver.findElement(By.name("hiringManager")).sendKeys(data.get("Hiring Manager"));
    }
    @Given("the vacancy {string} exists")
    public void theVacancyExists(String vacancyName) {
        Assert.assertTrue(driver.findElement(By.id("vacancyTable")).getText().contains(vacancyName));
    }

    @When("I locate the vacancy {string}")
    public void iLocateTheVacancy(String vacancyName) {
        driver.findElement(By.xpath("//td[text()='" + vacancyName + "']/..//button[text()='Delete']")).click();
    }
    @When("I click the {string} button for the candidate {string}")
    public void iClickTheButtonForTheCandidate(String button, String candidateName) {
        driver.findElement(By.xpath("//td[text()='" + candidateName + "']/..//button[text()='" + button + "']")).click();
    }

    @Then("I should see the detailed information of the candidate")
    public void iShouldSeeTheDetailedInformationOfTheCandidate() {
        WebElement detailsSection = driver.findElement(By.id("candidateDetails"));
        Assert.assertTrue(detailsSection.isDisplayed());
    }
    @When("I leave all filters blank")
    public void iLeaveAllFiltersBlank() {
        // Intentionally leave filters blank.
    }

    @Then("I should see all available candidates Or I should see a message {string}")
    public void iShouldSeeAllAvailableCandidatesOrIShouldSeeAMessage(String message) {
        WebElement resultsTable = driver.findElement(By.id("candidatesTable"));
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));

        boolean isResultsVisible = resultsTable.isDisplayed() && !resultsTable.getText().isEmpty();
        boolean isErrorMessageVisible = errorMessage.isDisplayed() && errorMessage.getText().equals(message);

        Assert.assertTrue(isResultsVisible || isErrorMessageVisible);
    }
    @When("I add a new candidate with:")
    public void iAddANewCandidateWith(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMaps(String.class, String.class).get(0);
        driver.findElement(By.name("name")).sendKeys(data.get("Name"));
        driver.findElement(By.name("email")).sendKeys(data.get("Email"));
        driver.findElement(By.name("jobTitle")).sendKeys(data.get("Job Title"));
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String errorMessage) {
        WebElement error = driver.findElement(By.id("errorMessage"));
        Assert.assertEquals(errorMessage, error.getText());
    }





}






