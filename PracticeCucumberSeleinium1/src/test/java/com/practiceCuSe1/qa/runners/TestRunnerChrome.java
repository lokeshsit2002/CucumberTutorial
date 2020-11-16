package com.practiceCuSe1.qa.runners;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;

import com.practiceCuSe1.qa.base.PracTestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		// use this parameter to generate Gherkin scenarios      dryRun=true,
	features= "src/test/java/com/practiceCuSe1/qa/features",
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	glue= {"com.practiceCuSe1.qa.stepdefinitions"},strict=true,tags= {"@prac00"},
	monochrome = true
	)

public class TestRunnerChrome extends AbstractTestNGCucumberTests {
	@BeforeClass
	public void selectBrowser()
	{
		PracTestBase.browserName="Chrome";
	}
}
