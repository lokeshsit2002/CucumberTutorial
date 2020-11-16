package com.practiceCuSe1.qa.stepdefinitions;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.pages.SeleniumPracticeFormPage;

import cucumber.api.java.en.When;

public class PracticeFormSteps extends PracTestBase {
	
public static Logger Log = LogManager.getLogger(PracticeFormSteps.class.getName());
	
	public PracticeFormSteps() {
		super();
	}

	 @When("^User fills basic details in Practice form having (.+)$")
	    public void user_fills_basic_details_in_practice_form_having(String experience) throws InterruptedException, AWTException{
		 selPracFormPage= new SeleniumPracticeFormPage();
		 selPracFormPage.fillBasicDetails(experience);
	    }
}
