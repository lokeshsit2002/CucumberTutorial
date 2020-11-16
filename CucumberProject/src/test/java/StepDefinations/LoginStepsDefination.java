package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Scenario;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class LoginStepsDefination {
	@Given("^User is on banking landing page$")
	public void user_is_on_banking_landing_page() throws Throwable {
		System.out.println("User on banking landing page");
		
	}

	 @When("^User login with \"([^\"]*)\" & \"([^\"]*)\"$")
	    public void user_login_with_something_something(String strArg1, String strArg2) throws Throwable {
		 System.out.println("User logged in successfully");
		 System.out.println(strArg1);
		 System.out.println(strArg2);
	    }
	 @When("^User login with following credentials$")
	    public void user_login_with_following_credentials(DataTable dt) {
		 List<String> list = dt.asList(String.class);
		 System.out.println("User logged in successfully");
		 System.out.println(list.get(0));
		 System.out.println(list.get(1));
	    }
	 
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Validated Home page");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Validated Cards");
	}

}
