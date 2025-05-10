Feature: check HomePage Fuctionality

Background: User is on logged in

Given user is on login page
When user enter username and password
And Clicks on login button
Then user is navigated to homapage

Scenario: Check logout Links displayed 
When user clicks on Welcome Link
Then Logout link is displyed

Scenario: Verify quick launch toolbar is present

When user clicks on dashboard link
Then quick launch toolbar is displayed 