Feature: practice Table
Description: Automate Search Product Functionality on Dummy E-Commerce Website

Background: User navigates to Windows & Alerts page
When User navigates to Demo Practice website
And User clicks on Automate Search Product functionality for eCommerce website
And User clicks on Automate Search Product Functionality on Dummy ECommerce Website
Then Title of the Automate Search Product page is "My Store"

@browser @prac00
Scenario: Automate Search Product Functionality on Dummy E-Commerce Website
When User Move your cursor over Women's link and Click on sub menu Tshirts
And User gets text of the first product displayed on the page
And User enters the same product name in the search bar present on top of page and clicks search button
Then Validate that same product is displayed on searched page with same details which were displayed on TShirt's page