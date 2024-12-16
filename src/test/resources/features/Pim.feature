Feature: PIM Module Functionality

  Background:
    Given user is navigated to OrangeHRM application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option

  @TC01
  Scenario: Add new employee
    When user clicks on Add Employee
    And user enters firstName and middleName and lastName
    And user clicks on save button
    Then employee added successfully
    And user should see the new employee under employee list

  @TC02
  Scenario: Search for an employee by name
    Given the user is on the employee list page
    When the user enters "employee name" in the search field
    And the user clicks the search button
    Then employee name should appear in the search results
    And the user should see the details of the employee

  @TC03
  Scenario: Search Employee by ID
    When user search employee by "ID"
    Then user should see employee name and info in the search results

  @TC04
  Scenario: Edit employee details
    Given "employee name" exists in the employee list
    When user select "employee name" and click "Edit"
    And user update employee's address to "2828 Gotham ave. NY"
    And user click "Save"
    Then the address should be updated for "employee name"

  @TC05
  Scenario: Delete an employee
    Given "employee name" exists in the employee list
    When user select "employee name" and click "Delete"
    And user confirm the deletion
    Then "employee name" should not appear in the employee list

  @TC06
  Scenario: Upload Employee Documents
    Given "employee name" exists in the employee list
    When user select "employee name"
    And user upload a document named "resume.pdf"
    And user clicks "Save"
    Then "resume.pdf" should be listed in the documents section for "employee name"

  @TC08
  Scenario: Add Employee Salary Details
    Given "employee name" exists in the employee list
    When user select "employee name" and click "Add"
    Then user should be able to add "employee's salary"
    And user click "Save"
    Then salary should be added for "employee name"

  @TC09
  Scenario: Update Employee Contact Information
    Given the user is on the employee details page for "employee name"
    When the user clicks the "Edit Contact Information" button
    And the user updates the phone number to "123-456-7890"
    And the user updates the email address to "abcdefgh@example.com"
    And the user clicks the "Save" button
    Then the contact information for the employee should be updated successfully
    And the user should see a confirmation message "Contact information is updated"


  @TC10
  Scenario: Assign Reporting Managers
    Given "employee name" exists in the employee list
    When user select "employee name"
    And user assign "Managers name" as a Manager
    And user click "Save"
    Then "Managers name" should be listed as a Manager for "employee name"


  @TC14
  Scenario: Generate Employee Report
    When user generate the "Employee List Report"
    Then the report should display all employees with their details