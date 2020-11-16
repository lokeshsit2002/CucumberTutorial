Feature: Fill practice form
Description: User fills the practice form successfully

Background: User navigates to Menu page
When User navigates to Demo Practice website
And User clicks on AUTOMATION PRACTICE FORM
Then Validate that AUTOMATION PRACTICE FORM page contains "selenium-practice-form"

@browser
Scenario Outline: Fill the proctice form successfully
When User fills basic details in Practice form having <Experience>

Examples:
|Experience			|
|4					|
|1					|
