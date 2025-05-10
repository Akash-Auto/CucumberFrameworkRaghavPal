

Feature: Test google Search Functionality

Scenario: Validate Google search is working

Given Browser is Open
And user is on google search page
When user enters text in search box
And hits enter
Then user is navigated to search result
