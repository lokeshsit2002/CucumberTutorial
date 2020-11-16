Feature: Navigation to Menu Page website and then to practice pages
Description: User navigates to Menu Page website and then to practice pages successfully

Background: User navigates to Menu page
When User navigates to Demo Practice website
Then Validate that Demo Practice site contains "top-6-demo-websites-for-practice"

@browser 
Scenario: User navigates to Selenium Practice Form
When User clicks on AUTOMATION PRACTICE FORM
Then Validate that AUTOMATION PRACTICE FORM page contains "selenium-practice-form"

@browser
Scenario: User navigates to Selenium Practice Table
When User clicks on AUTOMATION PRACTICE TABLE
Then Validate that AUTOMATION PRACTICE TABLE page contains "demo-selenium-practice"

@browser
Scenario: User navigates to Practice Windows & Alerts
When User clicks on PRACTICE WINDOWS & ALERTS
Then Validate that PRACTICE WINDOWS & ALERTS page contains "Practiceform"

@browser 
Scenario: User navigates to User Registration page
When User clicks on Automate User Registration for eCommerce website using Selenium Webdriver
And User clicks on Automate User Registration of Dummy ECommerce Website
Then Title of the User Registration page is "My Store"

@browser
Scenario: Automate "Search Product" Functionality for E-Commerce Website using Selenium
When User clicks on Automate Search Product functionality for eCommerce website
And User clicks on Automate Search Product Functionality on Dummy ECommerce Website
Then Title of the Automate Search Product page is "My Store"