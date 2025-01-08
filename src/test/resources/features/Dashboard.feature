Feature: Dashboard Module Functionality

  Background:
    Given the user logs in with "Username" and "Password"
    When the user is redirected to the dashboard page
  @OHR-6  @TC01 @dashboard @smoke
  Scenario: Verify dashboard loads correctly after a successful login
    #Given the user logs in with "Username" and "Password"
    When the user is redirected to the dashboard page
    Then the dashboard should display the header with the application logo
    And the dashboard should display the user's profile information
    And all widgets on the dashboard should be visible
    #And the navigation menu should be functional

  @OHR-6  @TC02 @dashboard
  Scenario: Verify "Time at Work" widget displays hours correctly
    Given the "Time at Work" widget is loaded on the dashboard
    When the user views the "Time at Work" widget
    Then the widget should display the total working hours for the day
    And the displayed hours should match the recorded work hours in the system
    And the widget should update dynamically if the user logs additional time

  @OHR-6  @TC03 @dashboard
  Scenario: Verify pending tasks are displayed correctly in "My Actions"
    Given the "My Actions" section is visible on the dashboard
    When the user views the "My Actions" section
    When the section should display a list of pending tasks
    Then the total number of tasks displayed should match the records in the system

  @OHR-6  @TC05 @dashboard @smoke
  Scenario: Verify dashboard responsiveness on a mobile device
    Given the user is viewing the dashboard on a mobile device
    Then all widgets should resize to fit the mobile screen dimensions
    And the navigation menu should be visible and functional
    And all elements should remain interactive

  @OHR-6  @TC07 @dashboard
  Scenario: Verify behavior when no employees are assigned to a location
    Given a location has no employees assigned
    When the user views the pie chart
    Then the chart should display a segment for the location with "Unassigned"
    And the chart should handle the scenario without visual errors

  #@OHR-6  @TC08 @dashboard
  #Scenario: Verify the Help button is visible and accessible
    #Given the "Help" button is displayed on the dashboard
    #When the user views the dashboard
    #Then the "Help" button should be visible
    #And the button should be focusable using the keyboard

  #@OHR-6  @TC10 @dashboard
  #Scenario: Verify user is redirected to the login page after session timeout
    #Given the user remains inactive on the dashboard for the session timeout duration
    ##Then  the user should be redirected to the login page


  @OHR-6 @dashboard
  Scenario: Verify widgets responsiveness on tablet
    Given the user is viewing the dashboard on a tablet device
    Then all widgets should resize to fit the tablet screen dimensions
    And all interactive elements should remain functional

  @OHR-6  @TC11 @dashboard @smoke
  Scenario: Verify navigational panel collapses when clicked
    Given the navigational panel is in an expanded state
    When the user clicks the panel toggle button
    Then the navigational panel should collapse smoothly
    And the toggle button should remain visible

  @OHR-6  @TC04 @dashboard
  Scenario: Verify behavior when no employees are on leave
    Given there are no employees on leave for today
    When the widget loads
    Then the widget should display a message "No employees on leave today"
    #And no employee entries should be listed

@OHR-6  @TC16 @smoke
  Scenario: Verify user personalization on the dashboard
    Given  the dashboard should display the user's profile picture
    Then the dashboard should display the user's full name

