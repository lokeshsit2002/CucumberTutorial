package com.practiceCuSe1.qa.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.pages.PracGlobalPassPage;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class PracDAD17LoginSteps extends PracTestBase {
	
	
	public static Logger Log = LogManager.getLogger(PracDAD17LoginSteps.class.getName());
	
//	{((org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false)).reconfigure();}
	/*
	 * GlobalPassPage gPassPage; LandingInitiatorPage lInitiatorPage;
	 * 
	 */
	PracTestUtil testutil;
 
	public PracDAD17LoginSteps() {
		super();
	}

	@When("^User navigates to CVX url$")
	public void user_navigates_to_cvx_url() {
		driver.get(prop.getProperty("CVXUrl"));
		Log.info("Driver is navigated to url");
		gPassPage = new PracGlobalPassPage();
		testutil = new PracTestUtil();
	}

	/*
	@Then("^DXC Global Pass Screen is opened$")
	public void dxc_global_pass_screen_is_opened() {
		System.out.println(gPassPage.getGlobalPassPageTitle());
		Assert.assertEquals(gPassPage.getGlobalPassPageTitle(), "Client Visit Experience");
	}
*/
	  @When("^In Microsoft login page,Enter UserId (.+)$")
	    public void in_microsoft_login_pageenter_userid(String userid) {
		  Log.debug("Enter UserId");
		  gPassPage.SigninUser(userid);
		  Log.info("UserIsd is entered successfully");
	    }
	  
	  @And("^In Global Pass login,Enter Password (.+)$")
	    public void in_global_pass_loginenter_password(String password) throws InterruptedException {
		  Log.debug("Enter Password");
		  lInitiatorPage = gPassPage.GlobalSignIn(password);
		  lInitiatorPage.clickMenuButton();
		  Log.info("Password is entered successfully");
	    }
	  
	/*
	  @When("^Enter UserId (.+) and Password (.+)$")
	public void enter_userid_and_password(String userid, String password) throws InterruptedException {
		lInitiatorPage = gPassPage.loginCredential(userid, password);
		lInitiatorPage.clickMenuButton();
	}
	
	*/

	@Then("^Validate that CVX landing initiator page url contains \"([^\"]*)\"$")
	public void validate_cvx_landing_page_url(String strArg1) {
		
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains(strArg1));
		Log.info(driver.getCurrentUrl());
	}

	/*
	@Then("^Validate that CVX landing initiator page url doesnot contain \"([^\"]*)\"$")
	public void validate_that_url_of_the_page_is_not_matched(String strArg1) {
		System.out.println(driver.getCurrentUrl());
		Assert.assertFalse(driver.getCurrentUrl().contains(strArg1));
		// Assert.assertEquals(driver.getTitle(), strArg1);
	}

	@And("^Invalid error message is displayed as \"([^\"]*)\"$")
	public void invalid_error_message_is_displayed_as_something(String strArg1) {
		gPassPage.validateInvalidCredentials(strArg1);
	}
	
	*/

}
