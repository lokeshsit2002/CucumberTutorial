package com.practiceCuSe1.qa.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.pages.LandingPage;
import com.practiceCuSe1.qa.pages.PracticeWindowsAlertsPage;
import com.practiceCuSe1.qa.pages.SearchProductPage;
import com.practiceCuSe1.qa.pages.SeleniumPracticeFormPage;
import com.practiceCuSe1.qa.pages.SeleniumPracticeTablePage;
import com.practiceCuSe1.qa.pages.UserRegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingStepDefinition extends PracTestBase {

	public static Logger Log = LogManager.getLogger(LandingStepDefinition.class.getName());

	public LandingStepDefinition() {
		super();
	}

	@When("^User navigates to Demo Practice website$")
	public void user_navigates_to_demo_practice_website() {
		Log.debug("Open The URL");
		driver.get(prop.getProperty("PracticeURL"));
		landPage = new LandingPage();

	}

	@Then("^Validate that Demo Practice site contains \"([^\"]*)\"$")
	public void validate_that_demo_practice_site_contains_something(String strArg1) {

		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains(strArg1));

		Log.info("The URL is opened successfully");
	}

	@When("^User clicks on AUTOMATION PRACTICE FORM$")
	public void user_clicks_on_automation_practice_form() {
		landPage.clickAutomationPracticeForm();
	}

	@Then("^Validate that AUTOMATION PRACTICE FORM page contains \"([^\"]*)\"$")
	public void validate_that_automation_practice_form_page_contains_something(String strArg1) {
		landPage.validateAutomationPracticeFormURL(strArg1);
		selPracFormPage = new SeleniumPracticeFormPage();
	}

	@When("^User clicks on AUTOMATION PRACTICE TABLE$")
	public void user_clicks_on_automation_practice_table() {
		landPage.clickAutomationPracticeTable();
	}

	@Then("^Validate that AUTOMATION PRACTICE TABLE page contains \"([^\"]*)\"$")
	public void validate_that_automation_practice_table_page_contains_something(String strArg1) {
		landPage.validateAutomationPracticeTableURL(strArg1);
		selPracTablePage = new SeleniumPracticeTablePage();
	}

	@When("^User clicks on PRACTICE WINDOWS & ALERTS$")
	public void user_clicks_on_practice_windows_alerts() {
		landPage.clickPracticeWindowsAlerts();
	}

	@Then("^Validate that PRACTICE WINDOWS & ALERTS page contains \"([^\"]*)\"$")
	public void validate_that_practice_windows_alerts_page_contains_something(String strArg1) {
		landPage.validatePracticeWindowsAlerts(strArg1);
		pracWindowsAlertsPage = new PracticeWindowsAlertsPage();
	}

	@When("^User clicks on Automate User Registration for eCommerce website using Selenium Webdriver$")
	public void user_clicks_on_automate_user_registration_for_ecommerce_website_using_selenium_webdriver() {
		landPage.clickOnAutomateUserRegistrationForeCommerceWebsiteUsingSeleniumWebdriver();
	}

	@And("^User clicks on Automate User Registration of Dummy ECommerce Website$")
	public void user_clicks_on_automate_user_registration_of_dummy_ecommerce_website() {
		landPage.clickOnAutomateUserRegistrationOfDummyECommerceWebsite();
	}

	@Then("^Title of the User Registration page is \"([^\"]*)\"$")
	public void title_of_the_user_registration_page_is_something(String strArg1) {
		landPage.validateTitleUserRegistrationPage(strArg1);
		userRegPage = new UserRegistrationPage();
	}

	@When("^User clicks on Automate Search Product functionality for eCommerce website$")
	public void user_clicks_on_automate_search_product_functionality_for_ecommerce_website() {
		landPage.clickOnAutomateSearchProductFunctionalityForeCommercewebsite();
	}

	@And("^User clicks on Automate Search Product Functionality on Dummy ECommerce Website$")
	public void user_clicks_on_automate_search_product_functionality_on_dummy_ecommerce_website() {
		landPage.clickOnAutomateSearchProductFunctionalityOnDummyECommerceWebsite();
	}

	@Then("^Title of the Automate Search Product page is \"([^\"]*)\"$")
	public void title_of_the_automate_search_product_page_is_something(String strArg1) {
		landPage.validateTitleProductSearchPage(strArg1);
		searchProPage = new SearchProductPage();
	}
}
