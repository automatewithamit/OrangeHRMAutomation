Feature: Directory Module
  As a user, I want to use the Directory module to view and manage employee records efficiently.
    @directory
  Background:
    Given the user is logged into the OrangeHRM system
    @directory
  Scenario: Verify the Directory page loads correctly
    When the user navigates to the Directory module
    Then the Directory page should load successfully with a header "Directory" and a list of employee records
    @directory
  Scenario: Verify the total number of records is displayed
    When the user navigates to the Directory module
    Then the total number of records should be displayed at the top of the page
    @directory
  Scenario: Verify search by employee name
    Given there are employees in the system
    When the user enters an employee name in the search bar and clicks "Search"
    Then the Directory should display employees matching the entered name
    @directory
  Scenario: Verify search by invalid employee name
    Given there are no employees matching the entered name
    When the user enters an invalid name in the search bar and clicks "Search"
    Then the system should display a message indicating "No records found"
    @directory
  Scenario: Verify search by job title
    Given employees have valid job titles assigned
    When the user selects a job title from the filter and clicks "Search"
    Then the Directory should display employees with the selected job title
    @directory
  Scenario: Verify the employee card displays accurate details
    When the user views the employee cards in the Directory module
    Then each card should display correct details like name, ID, and photo
    @directory
  Scenario: Verify the employee card is clickable
    Given there are employee cards in the Directory
    When the user clicks on an employee card
    Then the system should navigate to the detailed profile page of the selected employee
    @directory
  Scenario: Verify validation for empty search fields
    When the user clicks "Search" without entering any data in the search bar
    Then the system should display an error message or perform no action
    @directory
  Scenario: Verify sorting by employee name
    Given there are multiple employee records in the Directory
    When the user clicks on the "Name" column header to sort the list
    Then the employee list should be sorted alphabetically by name
    @directory
  Scenario: Verify pagination functionality
    Given there are more employee records than fit on one page
    When the user clicks the "Next" or "Previous" page buttons
    Then the system should display the corresponding page of employee records
