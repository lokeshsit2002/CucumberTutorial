package com.practiceCuSe1.qa.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeWindowsAlertsSteps extends PracTestBase {

	public static Logger Log = LogManager.getLogger(PracticeWindowsAlertsSteps.class.getName());

	public PracticeWindowsAlertsSteps() {
		super();
	}

	@When("^User clicks on new browser window$")
	public void user_clicks_on_new_browser_window() {
		pracWindowsAlertsPage.clickNewBrowserWindow();
	}

	@Then("^Validate that new browser window URL contains \"([^\"]*)\"$")
	public void validate_that_new_browser_window_url_contains_something(String strArg1) {
		pracWindowsAlertsPage.validateNewBrowserWindow(strArg1);
	}
	
	 @When("^User clicks on new browser message window$")
	    public void user_clicks_on_new_browser_message_window() {
		 pracWindowsAlertsPage.clickNewMessageWindow();
	    }

	    @Then("^Validate that new browser message window URL contains \"([^\"]*)\"$")
	    public void validate_that_new_browser_message_window_url_contains_something(String strArg1) {
	    	pracWindowsAlertsPage.validateNewMessageWindow(strArg1);
	    }
	    
	    
	    @When("^User clicks on new browser TAB$")
	    public void user_clicks_on_new_browser_tab()  {
	    	pracWindowsAlertsPage.clickNewBrowserTAB();
	    }

	    @Then("^Validate that new browser TAB URL contains \"([^\"]*)\"$")
	    public void validate_that_new_browser_tab_url_contains_something(String strArg1) {
	    	pracWindowsAlertsPage.validateNewBrowserTAB(strArg1);
	    	
	    }
	    
	    @When("^User clicks on JAVA Alert$")
	    public void user_clicks_on_java_alert()  {
	    	pracWindowsAlertsPage.clickJavaAlert();
	    }

	    @Then("^Validate that JAVA Alert contains \"([^\"]*)\"$")
	    public void validate_that_java_alert_contains_something(String strArg1)  {
	    	pracWindowsAlertsPage.validateJavaAlert(strArg1);
	    }
	    
	    @When("^User clicks on Timing Alert$")
	    public void user_clicks_on_Timing_alert()  {
	    	pracWindowsAlertsPage.clickTimingAlert();
	    }

	    @Then("^Validate that Timing Alert contains \"([^\"]*)\"$")
	    public void validate_that_Timing_alert_contains_something(String strArg1)  {
	    	pracWindowsAlertsPage.validateTimingAlert(strArg1);
	    }
	    
	    @And("^Validate that Buzz Buzz is present$")
	    public void validate_that_buzz_buzz_is_present() {
	    	pracWindowsAlertsPage.validateBuzzBuzz();
	    }
	    
	    @When("^User clicks on orange changing color button$")
	    public void user_clicks_on_orange_changing_color_button()  {
	    	pracWindowsAlertsPage.doubleClickChangingButton();
	    }

	    @Then("^Validate that the color of orange button is \"([^\"]*)\"$")
	    public void validate_that_the_color_of_orange_button_is_something(String strArg1) {
	    	pracWindowsAlertsPage.validateColorOrangeButton(strArg1);
	    }

	    @And("^Validate that the color of red button is \"([^\"]*)\"$")
	    public void validate_that_the_color_of_red_button_is_something(String strArg1) {
	    	pracWindowsAlertsPage.validateColorRedButton(strArg1);
	    }
	    
	    @And("^Validate that user drags DragMe to DragTo successfully$")
	    public void validate_that_user_drags_dragme_to_dragto_successfully() {
	    	pracWindowsAlertsPage.validateDragMeDragTo();
	    }
}
