Feature: practice Table
Description: User practices Windows & Alerts successfully

Background: User navigates to Windows & Alerts page
When User navigates to Demo Practice website
And User clicks on Automate User Registration for eCommerce website using Selenium Webdriver
And User clicks on Automate User Registration of Dummy ECommerce Website
Then Title of the User Registration page is "My Store"

@browser
Scenario: Verify that there are new browser Window available
When User clicks on SignIn Button
And User fills the emailId and clicks on account
And User fills the account information and clicks on Register
Then Validate that the signedIn user is "Ron Dsouza"
