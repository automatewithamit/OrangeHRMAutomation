Feature: Leave Module Functionality From Admin Login

  @Henny
  Background:
    Given user is on the OrangeHRM app
    When user enters valid username "Admin" and valid password "admin123"
    And clicks the login button
    Then user is logged into the application
    And navigates to the Leave Module

  @TC06HK @LeaveAdm_06
  Scenario: Approve a leave request and verify the status
    Given a leave request with the status Pending Approval exists in the Leave List tab
    When user clicks the Leave List tab
    And locates a leave request with the status Pending Approval and has actions Approve and Reject
    And clicks Approve button
    Then the leave request status changes from Pending Approval to Scheduled

  @TC08HK @LeaveAdm_08 @NotTested
  Scenario: Assign leave to an employee and verify the status in the Leave List
    Given the employee has sufficient leave balance
    When user clicks the Assign Leave tab
    And selects an employee and leave type "CAN FMLA"
    And enters valid leave date range "Dec 16" to "Dec 20"
    And clicks Assign button
    Then the leave is successfully assigned
    When user navigates to the Leave List tab
    And select Scheduled from the dropdown of the Show Leave With Status
    And clicks Search button
    Then the assigned leave for the specified employee appears with a status of Sheduled

  @TC10HK @LeaveAdm_10
  Scenario: Apply a leave request and verify that the Admin cannot approve their own request
    Given Admin has sufficient leave balance
    When user clicks the Apply tab
    And selects a valid leave type "CAN-FMLA"
    And enter a valid date range "Dec 30" to "Dec31"
    And clicks Apply button
    When admin navigates to the Leave List tab
    Then the leave request appears with the status of Pending Approval
    And the leave request does not have Actions of Approve or Reject

  @TC12HK @LeaveAdm_12
  Scenario: Add entitlement to multiple employees
    When user clicks the Entitlements tab
    And select Add Entitlement from the dropdown
    And choose Multiple Employees
    And select a valid leave type "CAN Personal"
    And select a valid leave period "1-1-2024 to 12-31-2024"
    And enter the number "15" of the entitlements
    And clicks Save button
    Then the addition confirmation page appears
    And the option to confirm or cancel are available

  @TC13HK @LeaveAdm_13
  Scenario: Add a new leave type (jury duty) and validate that new leave type appears in the system
    When user clicks the Configure tab
    And select Leave Types from the dropdown
    And clicks Add button
    And enter "Jury Duty" as the name of the new Leave Type
    And clicks on Save button
    And appears in the list of available leave types for the employees

  @TC14HK @LeaveAdm_14
  Scenario: Generate reports based on leave type
    When admin clicks the Reports tab
    And select Leave Entitlements and Usage Reports from the dropdown
    And clicks leave type in Generate For
    And selects the leave period "1-1-2024 - 12-31-2024"
    And clicks on Generate button
    Then the report displayed the leave entitlements and usage report for the specified period


