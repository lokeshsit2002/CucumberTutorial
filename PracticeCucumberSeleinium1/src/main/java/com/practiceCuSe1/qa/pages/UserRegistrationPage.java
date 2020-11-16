package com.practiceCuSe1.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class UserRegistrationPage extends PracTestBase {

	By signInButton = By.cssSelector("a[class='login']");
	By inputEmailID = By.cssSelector("input[id='email_create']");
	By createAccountButton = By.cssSelector("button#SubmitCreate span");
	By mrRadioBtn = By.cssSelector("input[id='id_gender1']");
	By firstName = By.cssSelector("input[id='customer_firstname']");
	By lastName = By.cssSelector("input[id='customer_lastname']");
	By password= By.cssSelector("input[id='passwd']");
	By dayBirth= By.cssSelector("select[id='days']");
	By monthBirth= By.cssSelector("select[id='months']");
	By yearBirth= By.cssSelector("select[id='years']");
	By receiveCheckBox = By.cssSelector("input[id='optin']");
	By company = By.cssSelector("input[id='company']");
	By address = By.cssSelector("input[id='address1']");
	By city = By.cssSelector("input[id='city']");
	By state = By.cssSelector("select[id='id_state']");
	By zipCode = By.cssSelector("input[id='postcode']");
	By mobile = By.cssSelector("input[id='phone_mobile']");
	By additionalAddress = By.cssSelector("input[id='alias']");
	By register = By.cssSelector("button#submitAccount span");
	By signedInUser = By.cssSelector(" div nav div:nth-child(1) a span");
	
	
	public void clickOnSignInButton() {
		driver.findElement(signInButton).click();
	}
	
	public void fillEmailIDClickOnAccountButton() {
		driver.findElement(inputEmailID).sendKeys(prop.getProperty("userEmailId"));
		driver.findElement(createAccountButton).click();
	}
	
	public void fillAccountInformation() {
		driver.findElement(mrRadioBtn).click();
		driver.findElement(firstName).sendKeys("Ron");
		driver.findElement(lastName).sendKeys("Dsouza");
		driver.findElement(password).sendKeys("Ron@123");
		
		Select selDays = new Select(driver.findElement(dayBirth));
		selDays.selectByValue("20");
		
		Select selMonth = new Select(driver.findElement(monthBirth));
		selMonth.selectByValue("6");
		
		Select selYear = new Select(driver.findElement(yearBirth));
		selYear.selectByValue("1980");
		
		driver.findElement(receiveCheckBox).click();
		driver.findElement(company).sendKeys("ABC");
		driver.findElement(address).sendKeys("MyAddress123");
		driver.findElement(city).sendKeys("Richmond");
		
		Select selState = new Select(driver.findElement(state));
		selState.selectByVisibleText("California");
		
		driver.findElement(zipCode).sendKeys("12345");
		driver.findElement(mobile).sendKeys("9999999910");
		driver.findElement(register).click();
	}
	
	public void validateSignedInUser(String signedInName) {
		
		WebDriverWait wait1= new WebDriverWait(driver,5);
		wait1.until(ExpectedConditions.textToBePresentInElement(driver.findElement(signedInUser), signedInName));
		
	}
	
}
