package com.practiceCuSe1.qa.pages;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class PracticeWindowsAlertsPage extends PracTestBase {

	By winNewBrowser = By.cssSelector("button[id='button1']");
	By winNewMessage = By.cssSelector("div p:nth-child(5) button");
	By winNewTab = By.cssSelector("div p:nth-child(6) button");
	By javaAlert = By.cssSelector("button[id='alert']");
	By timingAlert = By.cssSelector("button[id='timingAlert']");
	By buzzbuzz = By.cssSelector("span[id='clock']");
	By orangeButton = By.cssSelector("button[id='doubleClick']");
	By redButton = By.cssSelector("button[id='colorVar']");
	By dragMe = By.cssSelector("button[id='draga']");
	By dragTo = By.cssSelector("button[id='dragb']");

	public void clickNewBrowserWindow() {
		driver.findElement(winNewBrowser).click();

	}

	public void validateNewBrowserWindow(String nbwString) {
		String nbwMainHandle = driver.getWindowHandle();
		Set<String> nbwHandles = driver.getWindowHandles();
		Iterator<String> itr1 = nbwHandles.iterator();

		while (itr1.hasNext()) {
			String text1 = itr1.next();
			if (!text1.equalsIgnoreCase(nbwMainHandle)) {
				System.out.println("URL: " + text1);
				System.out.println(driver.switchTo().window(text1).getCurrentUrl());
				Assert.assertTrue(driver.switchTo().window(text1).getCurrentUrl().contains(nbwString));
			}
		}

	}

	public void clickNewMessageWindow() {
		driver.findElement(winNewMessage).click();

	}

	public void validateNewMessageWindow(String nbmString) {
		String nbmMainWindow = driver.getWindowHandle();
		Set<String> nbmHandles = driver.getWindowHandles();
		Iterator<String> itr1 = nbmHandles.iterator();
		Boolean requiredWindowFound = false;
		while (itr1.hasNext()) {
			String text1 = itr1.next();
			System.out.println("URL: " + text1);
			if (!text1.equalsIgnoreCase(nbmMainWindow)) {
				driver.switchTo().window(text1).close();
				requiredWindowFound = true;
			}
		}
		Assert.assertTrue(requiredWindowFound);

	}

	public void clickNewBrowserTAB() {
		driver.findElement(winNewTab).click();
	}

	public void validateNewBrowserTAB(String nTABString) {
		String nTABMainHandle = driver.getWindowHandle();
		Set<String> nTABHandles = driver.getWindowHandles();
		Iterator<String> itr2 = nTABHandles.iterator();

		while (itr2.hasNext()) {
			String text2 = itr2.next();
			if (!text2.equalsIgnoreCase(nTABMainHandle)) {
				System.out.println("URL: " + text2);
				System.out.println(driver.switchTo().window(text2).getCurrentUrl());
				Assert.assertTrue(driver.switchTo().window(text2).getCurrentUrl().contains(nTABString));
			}
		}

	}

	public void clickJavaAlert() {
		driver.findElement(javaAlert).click();

	}

	public void validateJavaAlert(String nAlertString) {
		System.out.println(driver.switchTo().alert().getText());
		Assert.assertTrue(driver.switchTo().alert().getText().contains(nAlertString));

	}

	public void clickTimingAlert() {
		driver.findElement(timingAlert).click();

	}

	public void validateTimingAlert(String nTimingAlertString) {
		WebDriverWait waitTime = new WebDriverWait(driver, 5);
		waitTime.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Assert.assertTrue(alert1.getText().contains(nTimingAlertString));
		alert1.accept();

	}

	public void validateBuzzBuzz() {

		System.out.println(driver.findElement(buzzbuzz).getText());
		WebDriverWait waitbuzz = new WebDriverWait(driver, 40);
		waitbuzz.until(ExpectedConditions.textToBePresentInElementLocated(buzzbuzz, "Buzz Buzz"));
		Assert.assertTrue(driver.findElement(buzzbuzz).getText().contains("Buzz Buzz"));

	}
	
	public void doubleClickChangingButton() {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(orangeButton)).doubleClick().build().perform();
		
	}

	public void validateColorOrangeButton(String orangeCol) {
		Assert.assertTrue(driver.findElement(orangeButton).getAttribute("style").contains(orangeCol));
	}
	
	public void validateColorRedButton(String redCol) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.findElement(redButton).getAttribute("style").contains(redCol));
	}
	
	public void validateDragMeDragTo() {
		
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("window.scrollTo(0,500)");
		
		Actions act = new Actions(driver);
		WebElement source= driver.findElement(dragMe);
		WebElement destination = driver.findElement(dragTo);
		try{
			act.dragAndDrop(source, destination).build().perform();
			Assert.assertTrue(true);
		} catch(Exception e) {
			Assert.assertTrue(false);
		}
		
		
	}
}
