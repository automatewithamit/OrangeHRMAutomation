<<<<<<< HEAD
Feature: Timesheet Management

  Background:
    Given the user is logged into OrangeHRM with valid credentials
    And the system is functional and accessible

  # Timesheet Management Scenarios
  Scenario: Verify employee timesheet submission
    When the employee navigates to "My Timesheets"
    And updates the timesheet hours
    And submits the timesheet for approval
    Then the timesheet should be submitted successfully
    And the status should update to "Pending Approval"

  Scenario: Verify manager approval of timesheets
    When the manager navigates to "Employee Timesheets"
    And opens a pending timesheet
    And approves the timesheet
    Then the timesheet status should update to "Approved"
    And a notification should be sent to the employee

  Scenario: Verify rejection of timesheets with comments
    When the manager navigates to "Employee Timesheets"
    And opens a pending timesheet
    And rejects the timesheet with comments
    Then the timesheet status should update to "Rejected"
    And the comments should be sent to the employee

  Scenario: Verify employee punch in/out functionality
    When the employee navigates to "Punch In/Out"
    And enters the punch-in/punch-out time
    And clicks "Save"
    Then the attendance record should be saved successfully

  Scenario: Verify attendance records display
    When the employee navigates to "My Records"
    And selects a specific date range
    Then the attendance records for the selected range should be displayed correctly

  # Attendance Management Scenarios
  Scenario: Verify manager view of attendance records
    When the manager navigates to "Employee Records"
    And searches for an employee
    And selects a date range
    Then the attendance records for the selected employee should be displayed correctly

  Scenario: Verify attendance settings configuration
    When the admin navigates to "Configuration"
    And updates the attendance settings (e.g., punch-in policy)
    And saves the changes
    Then the attendance settings should be updated successfully

  # Report Generation Scenarios
  Scenario: Verify generation of project reports
    When the manager navigates to "Project Reports"
    And selects a specific project
    And generates the report
    Then the project report should be displayed correctly

  Scenario: Verify generation of employee reports
    When the manager navigates to "Employee Reports"
    And selects an employee and a date range
    And generates the report
    Then the employee report should be displayed correctly

  Scenario: Verify generation of attendance summaries
    When the manager navigates to "Attendance Summary"
    And selects appropriate filters
    And generates the summary
    Then the attendance summary should be displayed correctly

  # Data Management Scenarios
  Scenario: Verify customer record management
    When the admin navigates to "Customers"
    And adds or edits a customer record
    And saves the changes
    Then the customer record should be updated successfully

  Scenario: Verify project record management
    When the manager navigates to "Projects"
    And adds or edits a project record
    And saves the changes
    Then the project record should be updated successfully

  Scenario: Verify validation for empty fields
    When the user navigates to "My Timesheets" or "Employee Timesheets"
    And leaves required fields empty during submission or approval
    Then a validation message should be displayed

  # System Performance Scenarios
  Scenario: Verify system performance with large datasets
    Given the system contains 1000+ records
    When the user navigates to "Employee Timesheets" or "Reports"
    Then the system should handle large datasets without errors or delays

  Scenario: Verify concurrent actions on timesheets
    Given two users are logged into OrangeHRM with valid credentials
    When both users attempt to approve or reject the same timesheet simultaneously
    Then the system should handle concurrent actions without conflicts
=======
#Feature: Timesheet and Attendance Management
#
#  Background:
#    Given the user is logged into OrangeHRM with the following credentials:
#      | Username | Admin     |
#      | Password | admin123  |
#    And the system is functional and accessible
#
#  # Timesheet Management Scenarios
#  @TimesheetSubmission @Timesheet
#  Scenario: Verify employee timesheet submission
#    When the employee navigates to "My Timesheets"
#    And the employee updates the timesheet hours
#    And the employee submits the timesheet for approval
#    Then the timesheet should be submitted successfully
#    And the status should update to "Pending Approval"
#
#  @TimesheetApproval @Timesheet
#  Scenario: Verify manager approval of timesheets
#    When the manager navigates to "Employee Timesheets"
#    And the manager opens a pending timesheet
#    And the manager approves the timesheet
#    Then the timesheet status should update to "Approved"
#    And a notification should be sent to the employee
#
#  @TimesheetRejection @Timesheet
#  Scenario: Manager rejects a pending timesheet and provides comments
#    When the manager navigates to the "Employee Timesheets" section
#    And the manager selects a pending timesheet for review
#    And the manager rejects the timesheet with a reason
#    Then the timesheet status should change to "Rejected"
#    And the manager’s comments should be sent to the employee
#
#  @PunchInOut @Timesheet
#  Scenario: Employee records punch-in and punch-out time
#    When the employee navigates to the "Punch In/Out" page
#    And the employee inputs their punch-in and punch-out times
#    And submits the punch times by clicking "Save"
#    Then the system should successfully save the attendance record
#
#
#  @AttendanceRecordDisplay @Timesheet
#  Scenario: Employee views attendance records for a specific date range
#    When the employee accesses the "My Records" section
#    And chooses a specific date range
#    Then the system should display the attendance records for the selected range correctly
#
#
#  # Attendance Management Scenarios
#  @ManagerAttendanceView @Timesheet
#  Scenario: Manager views attendance records of an employee within a date range
#    When the manager accesses the "Employee Records" section
#    And searches for a specific employee
#    And selects a desired date range
#    Then the attendance records for that employee should be displayed accurately
#
#
#  @AttendanceSettingsConfig @Timesheet
#  Scenario: Admin configures attendance settings
#    When the admin accesses the "Configuration" section
#    And modifies the attendance settings "punch-in policy"
#    And applies the changes
#    Then the attendance settings should be successfully updated
#
#
#  # Report Generation Scenarios
#  @ProjectReportGeneration @Timesheet
#  Scenario: Manager generates and views project report
#    When the manager accesses the "Project Reports" section
#    And chooses a specific project
#    And generates the corresponding report
#    Then the project report should be displayed accurately
#
#
#  @EmployeeReportGeneration @Timesheet
#  Scenario: Manager generates and views employee report
#    When the manager accesses the "Employee Reports" section
#    And selects an employee and specifies a date range
#    And generates the corresponding report
#    Then the employee report should be displayed correctly
#
#  @AttendanceSummaryGeneration @Timesheet
#  Scenario: Manager generates and views attendance summary
#    When the manager accesses the "Attendance Summary" section
#    And applies the relevant filters
#    And generates the summary report
#    Then the generated attendance summary should be displayed correctly
#
>>>>>>> origin/main
