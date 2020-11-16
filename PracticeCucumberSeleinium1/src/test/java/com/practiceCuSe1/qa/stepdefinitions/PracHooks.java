package com.practiceCuSe1.qa.stepdefinitions;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class PracHooks extends PracTestBase{
	
	public static Logger Log = LogManager.getLogger(PracHooks.class.getName());
	PracTestUtil ptestutil;
	
	@Before
	 public void Setup() {
		Log.info("TestCase Started");
		 initialization();
		 ptestutil = new PracTestUtil();
		
	}
	
	
	 @After
	    public void tearDown(Scenario scenario) throws InterruptedException {
	    	
	    	if (scenario.isFailed()) {
	    	      // Take a screenshot...
	    	      try {
					ptestutil.getScreenshot(scenario.getName());
					System.out.println(scenario.getSourceTagNames());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	      
	    	    }
	    	
			Thread.sleep(2000);
			if(driver!=null) {
			driver.quit();
			Log.info("Driver exit");
			}
			
			Log.info("TestCase Completed");
		}
}
