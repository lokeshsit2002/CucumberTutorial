Feature: practice Table
Description: User practices Windows & Alerts successfully

Background: User navigates to Windows & Alerts page
When User navigates to Demo Practice website
And User clicks on PRACTICE WINDOWS & ALERTS
Then Validate that PRACTICE WINDOWS & ALERTS page contains "Practiceform"

@browser 
Scenario: Verify that there are new browser Window available
When User clicks on new browser window
Then Validate that new browser window URL contains "seleniumframework"

@browser 
Scenario: Verify that there are new browser message available
When User clicks on new browser message window
Then Validate that new browser message window URL contains "viewing purposes"

@browser
Scenario: Verify that there are new browser TAB available
When User clicks on new browser TAB
Then Validate that new browser TAB URL contains "www.seleniumframework.com/"

@browser
Scenario: Verify that there are JAVA Alert available
When User clicks on JAVA Alert
Then Validate that JAVA Alert contains "your friends and in your organization"

@browser 
Scenario: Verify that there are Timing Alert available
When User clicks on Timing Alert
Then Validate that Timing Alert contains "your friends and in your organization"
And Validate that Buzz Buzz is present

@browser 
Scenario: Verify that there are changing color buttons available
When User clicks on orange changing color button
Then Validate that the color of orange button is "orange"
And Validate that the color of red button is "red"
And Validate that user drags DragMe to DragTo successfully
