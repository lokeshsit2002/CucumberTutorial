Feature: practice Table
Description: User practices Table successfully

Background: User navigates to Menu page
When User navigates to Demo Practice website
And User clicks on AUTOMATION PRACTICE TABLE
Then Validate that AUTOMATION PRACTICE TABLE page contains "demo-selenium-practice"

@browser
Scenario: Verify that there are only 4 structure values present
When User reads the 'Structure' column and finds out the total number of structures present
And User reads the value of 'Total' column
Then User matches the total vaue with the previous step value

@browser 
Scenario Outline: Verify the height of each structure
When User finds the structure <StructureName> in the Table
Then User validates the height <Height> of the structure

Examples:
|StructureName 		|Height	|
|Burj Khalifa		|829m	|
|Clock Tower Hotel	|601m	|
|Taipei 101			|509m	|
|Financial Center	|492m	|
