Feature: Application Login

Scenario: Home page default login
Given User is on banking landing page
#When User login with "user123" & "password123"
When User login with following credentials
|user123	|password123	|
Then Home page is populated
And Cards are displayed
