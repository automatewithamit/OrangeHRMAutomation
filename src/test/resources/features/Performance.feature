Feature: Performance Module functionality

  Background:
    Given the user is navigated to OrangeHRM login page
    When the user enters username value and password value
    And the user clicks the login button
    Then the user is successfully logged in
    And the user clicks Performance in navigation panel


  @TC-01
  Scenario: Verify employees can access My Reviews
    When the user clicks Manage Reviews
    And the user clicks My Reviews from dropdown
    Then user can successfully view My Reviews


  @TC-02
  Scenario: Verify employees can access My Trackers
    When the user clicks My Trackers
    Then the user can successfully view My Trackers


  @TC-03
  Scenario: Verify management can add KPI’s
    When the user clicks on Configure
    And the user clicks on KPIs from the dropdown
    And the user clicks the Add button under Key Performance Indicators for Job Title
    When the user enters Key Performance Indicator Title
    And the user selects Job Title from the dropdown
    And the user clicks the Save button under Add Key Performance Indicator
    Then the KPI is successfully saved


  @TC-04
  Scenario: Verify management can add performance tracker for employees
    When the user clicks on Configure
    And the user clicks on Trackers from the dropdown
    And the user clicks the Add button under Performance Trackers
    When the user enters Tracker Name, Employee Name, Reviewers and clicks Save button
    Then the performance tracker is successfully saved


  @TC-05
  Scenario: Verify management can add performance reviews/ratings for employees
    When the user clicks Manage Reviews
    And the user clicks Manage Reviews from the dropdown
    And the user clicks the Add button under Manage Performance Reviews
    When the user enters Employee Name, Supervisor Reviewers
    And the user selects Employee start date, end date, Due date from the dropdown
    And the user clicks the Activate button
    Then the performance review is successfully saved


  @TC-06
  Scenario: Verify management can access Employee Reviews
    When the user clicks Manage Reviews
    And the user clicks Employee Reviews
    Then user can successfully view the Employees Review


  @TC-07
  Scenario: Verify management can view Employee Trackers
    When the user clicks Employee Trackers
    And the user clicks the View icon
    Then the user can successfully view the Employee Trackers


  @TC-08
  Scenario: Verify management can complete employee reviews for employee
    When the user clicks Manage Reviews
    And the user clicks Employee Reviews
    And the user clicks the Evaluate icon under Employee Reviews
    When the user enters the ratings, select date of completion, final rating, final comment
    And the user clicks Complete button, confirm submission with ok
    Then the Employee Review is successfully saved


  @TC-09
  Scenario: Verify employees can complete self-evaluation review
    When the user clicks Manage Reviews
    And the user clicks My Reviews
    And the user clicks the Evaluate icon under My Reviews
    When the user enters the ratings
    And the users clicks Complete button and confirm submission with ok
    Then the self-evaluation is successfully saved


  @TC-10
  Scenario: Verify management can add KPI with no Job Title
    When the user clicks on Configure
    And the user clicks on KPIs from the dropdown
    And the user clicks the Add button under Key Performance Indicators for Job Title
    When the user enters Key Performance Indicator Title
    And the user clicks the Save button under Add Key Performance Indicator
    Then error message will appear stating Job Title is Required
