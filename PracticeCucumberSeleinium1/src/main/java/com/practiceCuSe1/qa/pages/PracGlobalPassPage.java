package com.practiceCuSe1.qa.pages;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class PracGlobalPassPage extends PracTestBase {
	PracTestUtil testutil = new PracTestUtil();
	public static Logger Log = LogManager.getLogger(PracGlobalPassPage.class.getName());

//	By fareCalendar = By.cssSelector("div[class='fb curPointFlt quicks ico14']");
	By userID = By.cssSelector("input[placeholder='Email ID']");
	By password = By.cssSelector("input[placeholder='Password']");
	By loginBtn = By.cssSelector("button[type='submit']");
	By errorInvalidCredentials = By.cssSelector("button[type='submit']");

	// microsoft login page

	By signInUser = By.cssSelector("input[id='i0116']");
	By nextMicrosoftBtn = By.cssSelector("input[id='idSIButton9']");

	// GlobalPass login page
	By guserID = By.cssSelector("input[id='userNameInput']");
	By gpassword = By.cssSelector("input[id='passwordInput']");
	By gloginBtn = By.cssSelector("span[id='submitButton']");
	
	//Actual DXCGlobalPass login page
	By actualguserID = By.cssSelector("input[id='USER']");

	public String getGlobalPassPageTitle() {
		wait.until(ExpectedConditions.presenceOfElementLocated(actualguserID));
		return driver.getTitle();
	}

	// microsoft
	public void SigninUser(String lUserEmail) {
		testutil.doGetElement(signInUser).sendKeys(lUserEmail);
		testutil.doGetElement(nextMicrosoftBtn).click();

	}

	// global pass login
	public PracLandingInitiatorPage GlobalSignIn(String globalpasswordtext)
			throws InterruptedException {

		testutil.doEnterText(gpassword, globalpasswordtext);
		testutil.doClick(gloginBtn);

		Thread.sleep(30000);

		return new PracLandingInitiatorPage();

	}

	public PracLandingInitiatorPage loginCredential(String userIDtext, String passwordtext) throws InterruptedException {
		testutil.doEnterText(userID, userIDtext);
		testutil.doEnterText(password, passwordtext);
		testutil.doClick(loginBtn);
		return new PracLandingInitiatorPage();
	}

	public void validateInvalidCredentials(String errorMsg) {
		Assert.assertTrue(testutil.doGetElement(errorInvalidCredentials).getText().contains(errorMsg));
	}

}
