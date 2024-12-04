Feature: OrangeHRM Automation for Candidates and Vacancies
  As a user of the OrangeHRM system
  I want to manage candidates and vacancies
  So that I can perform operations efficiently

  Background:
    Given I am on the login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I log in with username "Admin" and password "admin123"

  Scenario: Search candidates by job title
    Given I navigate to the "Candidates" menu
    When I apply the filter by job title "Software Engineer"
    And I click the "Search" button
    Then I should see a list of candidates matching the job title "Software Engineer"

  Scenario: Add a new candidate
    Given I navigate to the "Candidates" menu
    When I click the "Add" button
    And I fill in the candidate details:
      | Name        | Email              | Job Title         |
      | John Doe    | john.doe@example.com | Software Engineer |
    And I click the "Save" button
    Then I should see a confirmation message "Candidate added successfully"
    And the candidate "John Doe" should appear in the candidate list

  Scenario: Delete a candidate
    Given I navigate to the "Candidates" menu
    And the candidate "John Doe" exists
    When I locate the candidate "John Doe"
    And I click the "Delete" button
    And I confirm the deletion
    Then the candidate "John Doe" should no longer appear in the candidate list

  Scenario: Search vacancies by status
    Given I navigate to the "Vacancies" menu
    When I apply the filter by status "Open"
    And I click the "Search" button
    Then I should see a list of vacancies matching the status "Open"

  Scenario: Add a new vacancy
    Given I navigate to the "Vacancies" menu
    When I click the "Add" button
    And I fill in the vacancy details:
      | Job Title        | Department      | Hiring Manager  |
      | Software Engineer | IT              | Jane Smith      |
    And I click the "Save" button
    Then I should see a confirmation message "Vacancy added successfully"
    And the vacancy "Software Engineer" should appear in the vacancy list

  Scenario: Edit a vacancy
    Given I navigate to the "Vacancies" menu
    And the vacancy "Software Engineer" exists
    When I click the "Edit" button for the vacancy "Software Engineer"
    And I update the details to:
      | Job Title        | Department      | Hiring Manager  |
      | Senior Engineer  | IT              | Jane Smith      |
    And I click the "Save" button
    Then the vacancy details should be updated successfully

  Scenario: Delete a vacancy
    Given I navigate to the "Vacancies" menu
    And the vacancy "Software Engineer" exists
    When I locate the vacancy "Software Engineer"
    And I click the "Delete" button
    And I confirm the deletion
    Then the vacancy "Software Engineer" should no longer appear in the vacancy list

  Scenario: View candidate details
    Given I navigate to the "Candidates" menu
    And the candidate "John Doe" exists
    When I click the "View" button for the candidate "John Doe"
    Then I should see the detailed information of the candidate

  Scenario: Search with blank filters
    Given I navigate to the "Candidates" menu
    When I leave all filters blank
    And I click the "Search" button
    Then I should see all available candidates Or I should see a message "Please specify at least one filter"

  Scenario: Prevent duplicate candidate
    Given I navigate to the "Candidates" menu
    When I add a new candidate with:
      | Name        | Email              | Job Title         |
      | John Doe    | john.doe@example.com | Software Engineer |
    And I add the same candidate again
    Then I should see an error message "Candidate already exists".