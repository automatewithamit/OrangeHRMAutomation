Feature: My Timesheets Functionality
  This feature verifies the functionalities related to employee timesheets, including submission, approval, rejection, and related scenarios.

  Background:
    Given the user is on the OrangeHRM login page
    When the user enters their username "Admin" and password "admin123"
    And clicks the "Login" button
    Then the user should be logged in successfully
    And navigates to the "Timesheets" module

  Scenario: Verify employee timesheet submission
    Given the user is on the "My Timesheets" page
    When the user updates the hours and submits the timesheet for approval
    Then the timesheet should be updated and submitted successfully

  Scenario: Verify manager approval of timesheets
    Given the manager is on the "Employee Timesheets" page
    When the manager opens a timesheet and clicks "Approve"
    Then the timesheet status should update to "Approved"
    And a notification should be sent to the employee

  Scenario: Verify rejection of timesheets with comments
    Given the manager is on the "Employee Timesheets" page
    When the manager rejects a timesheet with comments
    Then the timesheet status should update to "Rejected"
    And the comments should be sent to the employee

  Scenario: Verify employee punch in/out functionality
    Given the employee is on the "Punch In/Out" page
    When the employee enters the punch-in or punch-out time and clicks "Save"
    Then the attendance record should be saved successfully

  Scenario: Verify attendance records display
    Given the employee is on the "My Records" page
    When the employee selects a date range and views the attendance details
    Then the attendance details should be displayed correctly

  Scenario: Verify manager view of employee attendance records
    Given the manager is on the "Employee Records" page
    When the manager searches for an employee and selects a date range
    Then the attendance records for the selected employee should be displayed correctly

  Scenario: Verify attendance settings configuration
    Given the user is on the "Configuration" page
    When the user updates attendance settings (e.g., punch-in policy) and saves changes
    Then the attendance settings should be updated successfully

  Scenario: Verify generation of project reports
    Given the user is on the "Project Reports" page
    When the user selects a project and generates a report
    Then the project report should be displayed correctly

  Scenario: Verify generation of employee reports
    Given the user is on the "Employee Reports" page
    When the user selects an employee, a date range, and generates a report
    Then the employee report should be displayed correctly

  Scenario: Verify generation of attendance summary reports
    Given the user is on the "Attendance Summary" page
    When the user selects filters (e.g., department) and generates a summary report
    Then the attendance summary should be displayed correctly
