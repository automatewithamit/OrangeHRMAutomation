Feature: Leave Module Functionality From Employee Login

  Background:
    Given user is on the OrangeHRM app
    When user enters valid username "BluePurple" and valid password "BloodMoon123"
    And user clicks the login button
    Then user is logged into the application
    And navigates to the Leave Module

  @TC01 @Employee
  Scenario: Employee submit for a valid leave request and verify the status
    Given user has sufficient leave entitlement balance
    When user clicks the Apply tab
    And selects a valid Leave Type "CAN FMLA"
    And enters a valid date range "Dec 16 to Dec 20"
    And clicks Apply button
    Then the leave request is successfully saved
    When user navigates to the My Leave tab
    Then the leave request status is displayed as Pending Approval

  @TC03 @Employee
  Scenario: Cancel a scheduled leave and verify the status
    Given user has a Scheduled leave request
    When user clicks the My Leave tab
    And locates a leave request with the status Scheduled
    And clicks Cancel button
    Then the leave status changes from Sheduled to Cancelled

  @TC04 @Employee
  Scenario: View entitlement balances for all leave type
    Given user's entitlements have been configured by the Admin
    When user clicks the Entitlements tab
    And select My Entitlements from the dropdown
    Then the system displays entitlements balances and validity dates for each leave type

  @TC05 @Employee
  Scenario: View report based on leave period
    When user clicks on the Reports tab
    And selects My Leave Entitlements and Usage Report from the dropdown
    And selects any Leave Period "1-1-2024 to 12-31-2024"
    And clicks Generate button
    Then the report displays leave balance, usage, and remaining entitlement for the selected period

