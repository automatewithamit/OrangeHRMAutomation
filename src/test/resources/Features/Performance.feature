Feature: Performance Module functionality
  This feature validates the functionality of tracking employee performance

  Background:
    Given the user is navigated to OrangeHRM login page
    When the user enters username "Admin" and password "admin123"
    And the user clicks the login button
    Then the user is successfully logged in
    And the user clicks Performance

  Scenario: Verify user can access My Reviews
    When the user clicks Manage Reviews
    And the user clicks My Reviews from dropdown
    Then user can sucessfully see My Reviews

  Scenario: Verify employees can access My Trackers
    When the user clicks My Trackers
    Then the user can sucessfully see My Trackers

  Scenario: Verify management can add KPI’s
    When the user clicks on Configure
    And the user clicks on KPIs from the dropdown
    And the user clicks the Add button under Key Perfromance Indicators for Job Title
    When the user enters Key Performance Indicator Title
    And the user selects Job Title from the dropdown
    And the user clicks the Save button under Add Key Performance Indicator
    Then the KPI is succesfully saved

  Scenario: Verify management can add performance tracker for employees
    When the user clicks on Configure
    And the user clicks on Trackers from the dropdown
    And the user clicks the Add button under Performance Trackers
    When the user enters Tracker Name, Employee Name, Reviewers and clicks Save button
    Then the performance tracker is successfully saved


