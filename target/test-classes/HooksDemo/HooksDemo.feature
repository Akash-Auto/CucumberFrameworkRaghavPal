Feature: Test Lofin Functionality

Scenario: Check lofin is successful with valid credential

Given User is on login page
When user enter username and password 
And clicks on login button
Then user is navigated to the home page