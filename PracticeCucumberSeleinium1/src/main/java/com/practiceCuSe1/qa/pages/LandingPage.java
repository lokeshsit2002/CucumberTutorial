package com.practiceCuSe1.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.practiceCuSe1.qa.util.PracTestUtil;


public class LandingPage extends PracTestUtil {
    By autoPracticeForm = By.cssSelector("div[class='MsoNormal'] a span:nth-child(1)");
    By autoPracticeTable = By.cssSelector("div div:nth-child(7) b:nth-child(3) span a span");
    By practiceWindowsAlerts = By.cssSelector("span:nth-child(4) span b a span");
	By automateUserRegistrationPractice = By.cssSelector("div:nth-child(2) ol ol li:nth-child(2) a:nth-child(2)");
	By automateUserRegistrationSiteLink = By.cssSelector("div div:nth-child(10) a");
	By automateSearchProductPractice = By.cssSelector("div:nth-child(2) ol ol li:nth-child(3) a");
	By automateSearchProductLink = By.cssSelector("div[class='post-body entry-content float-container'] div div:nth-child(5) div:nth-child(1) a");
	
	
    public void clickAutomationPracticeForm() {
    	driver.findElement(autoPracticeForm).click();
    }
    
    public void validateAutomationPracticeFormURL(String urlContent) {
    	System.out.println(driver.getCurrentUrl());
    	Assert.assertTrue(driver.getCurrentUrl().contains(urlContent));
    }
    
    public void clickAutomationPracticeTable() {
    	driver.findElement(autoPracticeTable).click();
    }
    
    public void validateAutomationPracticeTableURL(String urlContent) {
    	System.out.println(driver.getCurrentUrl());
    	Assert.assertTrue(driver.getCurrentUrl().contains(urlContent));
    }
    
    public void clickPracticeWindowsAlerts() {
    	driver.findElement(practiceWindowsAlerts).click();
    }
    
    public void validatePracticeWindowsAlerts(String urlContent) {
    	System.out.println(driver.getCurrentUrl());
    	Assert.assertTrue(driver.getCurrentUrl().contains(urlContent));
    }
    
    public void clickOnAutomateUserRegistrationForeCommerceWebsiteUsingSeleniumWebdriver() {
    	WebDriverWait wait11 = new WebDriverWait(driver,20);
    	wait11.until(ExpectedConditions.elementToBeClickable(automateUserRegistrationPractice));
    	driver.findElement(automateUserRegistrationPractice).click();
    }
    
    public void clickOnAutomateUserRegistrationOfDummyECommerceWebsite() {
    	WebDriverWait wait12 = new WebDriverWait(driver,20);
    	wait12.until(ExpectedConditions.elementToBeClickable(automateUserRegistrationSiteLink));
    	driver.findElement(automateUserRegistrationSiteLink).click();
    }
    
    public void validateTitleUserRegistrationPage(String regTitle) {
    	driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
    	Assert.assertTrue(driver.getTitle().contains(regTitle));
    	
    }
    
    public void clickOnAutomateSearchProductFunctionalityForeCommercewebsite() {
    	WebDriverWait wait21 = new WebDriverWait(driver,20);
    	wait21.until(ExpectedConditions.elementToBeClickable(automateSearchProductPractice));
    	driver.findElement(automateSearchProductPractice).click();
    }
    
    public void clickOnAutomateSearchProductFunctionalityOnDummyECommerceWebsite() {
    	WebDriverWait wait22 = new WebDriverWait(driver,20);
    	wait22.until(ExpectedConditions.elementToBeClickable(automateSearchProductLink));
    	driver.findElement(automateSearchProductLink).click();
    }
    
    public void validateTitleProductSearchPage(String searchTitle) {
    	driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
    	Assert.assertTrue(driver.getTitle().contains(searchTitle));
    	
    }
    
    
   
}
