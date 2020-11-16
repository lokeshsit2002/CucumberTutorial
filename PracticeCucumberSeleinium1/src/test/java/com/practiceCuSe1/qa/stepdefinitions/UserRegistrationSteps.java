package com.practiceCuSe1.qa.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistrationSteps extends PracTestBase {

	public static Logger Log = LogManager.getLogger(UserRegistrationSteps.class.getName());

	public UserRegistrationSteps() {
		super();
	}

	  @When("^User clicks on SignIn Button$")
	    public void user_clicks_on_signin_button()  {
		  userRegPage.clickOnSignInButton();
	    }

	    @And("^User fills the emailId and clicks on account$")
	    public void user_fills_the_emailid_and_clicks_on_account()  {
	    	userRegPage.fillEmailIDClickOnAccountButton();
	    }

	    @And("^User fills the account information and clicks on Register$")
	    public void user_fills_the_account_information_and_clicks_on_register()  {
	    	userRegPage.fillAccountInformation();
	    }
	    
	    @Then("^Validate that the signedIn user is \"([^\"]*)\"$")
	    public void validate_that_the_signedin_user_is_something(String strArg1)  {
	    	userRegPage.validateSignedInUser(strArg1);
	    }
}
