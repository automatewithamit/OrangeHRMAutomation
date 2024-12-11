Feature: Admin User Management Functionality

  Background:
    Given I am logged in as an admin
    When I navigate to the "User Management" module

  Scenario: Add a new user as an admin
    When I click the "Add User" button
    And I fill in all required fields with valid data
    And I click "Save"
    Then the new user should be successfully added
    And a confirmation message should be displayed


  Scenario: Verify the system prevents adding a user with an existing username
    When I click the "Add User" button
    And I fill in all required fields with an existing username
    And I click "Save"
    Then an error message "Username already exists" should be displayed


  Scenario: Verify validation of required fields when adding a user
    When I click the "Add User" button
    And I leave all required fields empty
    And I click "Save"
    Then error messages should be displayed for the following fields:
      | Field   | Error Message       |
      | Name    | "Name is required"  |
      | Email   | "Email is required" |



  Scenario: Verify the system prevents adding a user with an invalid password
    When I click the "Add User" button
    And I fill in all required fields with valid data except for the password field
    And I enter an invalid password such as "12345" or "password"
    And I click the "Save" button
    Then an error message "Password must meet complexity requirements" should be displayed
    And the user should not be added to the system



  Scenario: Verify the system allows updating a user's role and status
    When I select a user from the "Users" list
    And I click the "Edit" button
    And I update the user's role and status with new values
    And I click the "Save" button
    Then the updated role and status should be saved successfully
    And the changes should be reflected in the "Users" list


  Scenario: Verify the system prevents editing multiple users at once
    When I select multiple users from the "Users" list
    And I click the "Edit" button
    Then the system should prevent editing multiple users at once
    And an error message or warning should be displayed indicating that only one user can be edited at a time



  Scenario: Verify the system allows deleting a user
    When I select a user from the "Users" list
    And I click the "Delete" button
    And I confirm the deletion
    Then the selected user should be deleted
    And the "Users" list should be updated to reflect the changes


  Scenario: Verify the system allows deleting multiple users at once
    When I select multiple users from the "Users" list
    And I click the "Delete" button
    And I confirm the deletion
    Then all selected users should be deleted
    And the "Users" list should be updated to reflect the changes


  Scenario: Verify the system updates the "Users" list based on valid search criteria
    When I enter valid search criteria in the search bar
    Then the "Users" list should update to display users matching the search criteria


  Scenario: Verify the system displays "No Records Found" when no users match the search criteria
    When I enter search criteria that do not match any records
    Then the system should display the message "No Records Found"












