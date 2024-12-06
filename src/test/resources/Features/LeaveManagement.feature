Feature: Leave Module Functionality Testing

  @Employee
  Background:
    Given Employee is on the OrangeHRM app
    When Employee enters valid credentials
    And Employee clicks the login button
    Then Employee is logged into the application
    And  navigates to the Leave Module

  @Admin
  Background:
    Given Admin is on the OrangeHRM app
    When Admin enters valid credentials
    And Admin clicks the login button
    Then Admin is logged into the application
    And  navigates to the Leave Module

  @TC01 @Employee
  Scenario: Submit for a valid leave request and verify the status
    Given user has sufficient leave entitlement balance
    When user clicks the Apply tab
    And selects a valid Leave Type
    And enters a valid date range
    And clicks Apply button
    Then the leave request is successfully saved
    When user navigates to the My Leave tab
    Then the leave request status is displayed as Pending Approval

  @TC03  @Employee
  Scenario: Cancel a scheduled leave and verify the status
    Given user has a Scheduled leave request
    When user clicks the My Leave tab
    And locates a leave request with the status Scheduled
    And clicks Cancel button
    Then the leave status changes from Sheduled to Cancelled

  @TC04  @Employee
  Scenario: View entitlement balances for all leave type
    Given user's entitlements have been configured by the Admin
    When user clicks the Entitlements tab
    And select My Entitlements from the dropdown
    Then the system displays entitlements balances and validity dates for each leave type

  @TC05  @Employee
  Scenario: View report based on leave period
    When user clicks on the Reports tab
    And selects My Leave Entitlements and Usage Report from the dropdown
    And selects any Leave Period
    And clicks Generate button
    Then the report displays leave balance, usage, and remaining entitlement for the selected period


  @TC06  @Admin
  Scenario: Approve a leave request and verify the status
    Given a leave request with the status Pending Approval exists in the Leave List tab
    When user clicks the Leave List tab
    And locates a leave request with the status Pending Approval and has actions Approve and Reject
    And clicks Approve button
    Then the leave request status changes from Pending Approval to Scheduled

  @TC08  @Admin
  Scenario: Assign leave to an employee and verify the status in the Leave List
    Given the employee has sufficient leave balance
    When user clicks the Assign Leave tab
    And selects an employee and a leave type
    And enters valid leave date range
    And clicks Assign button
    Then the leave is succesfully assigned
    When user navigates to the Leave List tab
    And select Scheduled from the dropdown of the Show Leave With Status
    And clicks Search button
    Then the assigned leave for the specified employee appears with a status of Sheduled

  @TC10  @Admin
  Scenario: Apply a leave request and verify that the Admin cannot approve their own request
    Given Admin has sufficient leave balance
    When user clicks the Apply tab
    And selects a valid leave type
    And enter a valid date range
    And clicks Apply button
    Then the leave request is successfully saved
    When admin navigates to the Leave List tab
    Then the leave request appears with the status of Pending Approval
    And the leave request does not have Actions of Approve or Reject

  @TC12  @Admin
  Scenario: Add entitlement to multiple employees
    When user clicks the Entitlements tab
    And select Add Entitlement from the dropdown
    And choose Multiple Employees
    And select a valid leave type
    And select a valid leave period
    And enter the number of the entitlements
    And clicks Save button
    Then the addition confirmation page appears
    And the page displays the updated balance for the matching employees
    And the option to confirm or cancel are available

  @TC13  @Admin
  Scenario: Add a new leave type (jury duty) and validate that new leave type appears in the system
    When user clicks the Configure tab
    And select Leave Types from the dropdown
    And clicks Add button
    And enter Jury Duty as the name of the new Leave Type
    And clicks Yes button for the question Is Entitlement Situational
    And clicks Save button
    Then the new leave type is successfully saved
    And appears in the list of available leave types for the employees

  @TC14  @Admin
  Scenario: Generate reports for individual employee in a specific period
    When user clicks the Reports tab
    And select Leave Entitlements and Usage Reports from the dropdown
    And clicks Employee in Generate For
    And enters the employee name
    And selects the leave period
    And clicks Generate button
    Then the report displayed the specified employee's leave usage and balances for the specified leave period

