Feature: Navigation to Demo Practice website
Description: User navigates to Demo Practice website successfully

@browser
Scenario: Validate User navigates to Demo Practice website successfully
When User navigates to Demo Practice website
Then Validate that Demo Practice site contains "top-6-demo-websites-for-practice"
