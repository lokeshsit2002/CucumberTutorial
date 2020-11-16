package com.practiceCuSe1.qa.stepdefinitions;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.pages.SeleniumPracticeFormPage;
import com.practiceCuSe1.qa.pages.SeleniumPracticeTablePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeTableSteps extends PracTestBase {
	
public static Logger Log = LogManager.getLogger(PracticeTableSteps.class.getName());
	
	public PracticeTableSteps() {
		super();
	}

	  @When("^User reads the 'Structure' column and finds out the total number of structures present$")
	    public void user_reads_the_structure_column_and_finds_out_the_total_number_of_structures_present() {
		  selPracTablePage = new SeleniumPracticeTablePage();
		  selPracTablePage.totalStructureCount();
		  
	    }
	  
	  
	  @And("^User reads the value of 'Total' column$")
	    public void user_reads_the_value_of_total_column() {
		  selPracTablePage.totalCount();
	    }

	    @Then("^User matches the total vaue with the previous step value$")
	    public void user_matches_the_total_vaue_with_the_previous_step_value() {
	    	selPracTablePage.validateTheMatch();
	    }

	    @When("^User finds the structure (.+) in the Table$")
	    public void user_finds_the_structure_in_the_table(String structureName)  {
	    	selPracTablePage.userFindsStructureRow(structureName);
	    }

	    @Then("^User validates the height (.+) of the structure$")
	    public void user_validates_the_height_of_the_structure(String height) {
	    	selPracTablePage.validateHeightOfStructure(height);
	    }
	   
}
