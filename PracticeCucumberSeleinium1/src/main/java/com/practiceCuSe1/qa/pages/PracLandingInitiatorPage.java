package com.practiceCuSe1.qa.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;


import com.practiceCuSe1.qa.util.PracTestUtil;

public class PracLandingInitiatorPage extends PracTestUtil {
	PracTestUtil testutil = new PracTestUtil();
	public static Logger Log = LogManager.getLogger(PracLandingInitiatorPage.class.getName());

	//By userName = By.cssSelector("button[id='dropdownManual'] span:nth-child(2)");
//	By userName = By.cssSelector("button[id='dropdownManual']");
	By userName = By.cssSelector("a[id='dropdownMenuLink'] span:nth-child(2)");
	//By userSignOut = By.cssSelector("div[class='dropdown-menu'] a");
	By userSignOut = By.cssSelector("a[class='dropdown-item']");
	By signoutConfirmationMsgAccept =  By.cssSelector("button[class='btn btn-primary btn-sm']");
	
	By menuButton = By.cssSelector("div[id='showleft'] a");
	By dashboard = By.cssSelector("div[id='nav-tab'] a:nth-child(1) span");
	By newVisit = By.cssSelector("div[id='nav-tab'] a:nth-child(2) span");
	By draft = By.cssSelector("a[id='nav-draft-tab'] span");
	By allVisits = By.cssSelector("a[id='nav-allvisits-tab'] span");
	By myVisits = By.cssSelector("a[id='nav-allvisits-tab'] span");
	By reports = By.cssSelector("a[id='nav-reports-tab'] span");
	By adminMgmt = By.cssSelector("a[id='nav-admin-tab'] span");
    
	
	public String getUserNameText() {
		Log.debug("Get the Username");
		return testutil.doGetText(userName);
	}

	public String getDashboardText() {
		Log.debug("Get the DashBoard Tab Text");
		return testutil.doGetText(dashboard);
	}

	public String getNewVisitText() {
		Log.debug("Get the Initiate New Visit Tab Text");
		return testutil.doGetText(newVisit);
	}

	public String getDraftText() {
		Log.debug("Get the Draft Tab Text");
		return testutil.doGetText(draft);
	}

	public String getAllVisitsText() {
		Log.debug("Get the AllVisits Tab Text");
		return testutil.doGetText(allVisits);
	}

	public String getMyVisitsText() {
		Log.debug("Get the MyVisits Tab Text");
		return testutil.doGetText(myVisits);
	}

	public String getreportsText() {
		Log.debug("Get the Repots Tab Text");
		return testutil.doGetText(reports);
	}

	public String getAdminMgmtText() {
		Log.debug("Get the Admin Management Tab Text");
		return testutil.doGetText(adminMgmt);
	}

	public void notFoundAdminMgmtText() {
		try {
			Log.debug("Check that Admin Management Tab is not present");
			testutil.doGetElement(adminMgmt);
			Assert.assertTrue(false);
			Log.error("Admin Management Tab is present");
		} catch (NoSuchElementException e) {
			Assert.assertTrue(true);
			Log.info("Admin Management Tab is not present");
		}
	}

	public void notFoundReportText() {
		try {
			Log.debug("Check that Report Tab is not present");
			testutil.doGetElement(reports);
			Assert.assertTrue(false);
			Log.error("Report Tab is present");
		} catch (NoSuchElementException e) {
			Assert.assertTrue(true);
			Log.info("Report Tab is not present");
		}
	}

	public void clickMenuButton() {
		if(browserName.contains("Android")||browserName.contains("IOS")) {
			Log.debug("Click on collapseable Menu button of mobile or Tab");
			testutil.doGetElement(menuButton).click();
			Log.info("The ollapseable Menu button of mobile or Tab is clicked");
		}
		
		else {
			Log.info("The collapsable menu is not needed for desktop version");
			System.out.println("The collapsable menu is not needed for desktop version");
		}
			
	}
	public String getDashboardPageURL() {
		Log.debug("Get the Dashboard page url");
		return driver.getCurrentUrl();
	}

	/*
	 public SInitiateNewVisitPage clickInitiateNewVisitTab() {
		Log.debug("Click on Initiate New VisitTab");
		testutil.doClick(newVisit);
		return new SInitiateNewVisitPage();

	}
	
	

	
	public SDraftsPage clickDraftsTab() {
		Log.debug("Click on Draft Tab");
		testutil.doClick(draft);
		return new SDraftsPage();

	}


	public SAllVisitsPage clickAllVisitsTab() {
		Log.debug("Click on AllVisits Tab");
		testutil.doClick(allVisits);
		return new SAllVisitsPage();

	}

	public SMyVisitsPage clickMyVisitsTab() {
		Log.debug("Click on MyVisits Tab");
		testutil.doClick(myVisits);
		return new SMyVisitsPage();

	}

	public SReportsAnalyticsPage clickReportsAnalyticsTab() {
		Log.debug("Click on Reports Analytics Tab");
		testutil.doClick(reports);
		return new SReportsAnalyticsPage();

	}

	public SAdminManagementPage clickAdminManagementTab() {
		Log.debug("Click on Admin Management Tab");
		testutil.doClick(adminMgmt);
		return new SAdminManagementPage();

	}
	
	*/

	public PracLandingInitiatorPage clickLandingInitiatorTab() {
		Log.debug("Click on Dashboard Tab");
		testutil.doClick(dashboard);
		return new PracLandingInitiatorPage();

	}

	public PracGlobalPassPage userSignout() {
		//LCVXT1
	//	System.out.println(testutil.doGetText(userName));
		Log.debug("User tries to logout");
		testutil.doClick(userName);
		testutil.doClick(userSignOut);
		testutil.doClick(signoutConfirmationMsgAccept);
		Log.debug("Logout is successful");
		return new PracGlobalPassPage();

	}

}
