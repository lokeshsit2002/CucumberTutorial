package com.practiceCuSe1.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class SeleniumPracticeFormPage extends PracTestBase {

	By firstName = By.cssSelector("input[name='firstname']");
	By lastName = By.cssSelector("input[name='lastname']");
	By maleGender = By.cssSelector("input[id='sex-0']");
	By femaleGender = By.cssSelector("input[id='sex-1']");
	By yearExperience1 = By.cssSelector("input[id='exp-0']");
	By yearExperience2 = By.cssSelector("input[id='exp-1']");
	By yearExperience3 = By.cssSelector("input[id='exp-2']");
	By yearExperience4 = By.cssSelector("input[id='exp-3']");
	By yearExperience5 = By.cssSelector("input[id='exp-4']");
	By yearExperience6 = By.cssSelector("input[id='exp-5']");
	By yearExperience7 = By.cssSelector("input[id='exp-6']");
	By date1 = By.cssSelector("input[id='datepicker']");
	By profession = By.cssSelector("input[id='profession-1']");
	By autoTools = By.cssSelector("input[id='tool-1']");
	By continentItems = By.cssSelector("select[id='continents']");
	By selCommands = By.cssSelector("select[id='selenium_commands'");
	By photo = By.cssSelector("input[id='photo']");
//	By photo = By.xpath("//input[@id='photo']");
	By button1 = By.cssSelector("button[id='submit']");

	PracTestUtil pTestUtil = new PracTestUtil();
	Date d1 = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	int pCount = 1;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String script;
	String text;
	WebElement uploadElement;

	public void fillBasicDetails(String Exp) throws InterruptedException, AWTException {
		driver.findElement(firstName).sendKeys("Lokesh");
		driver.findElement(lastName).sendKeys("Singh");
		driver.findElement(maleGender).click();

		switch (Integer.parseInt(Exp)) {
		case 1:
			driver.findElement(yearExperience1).click();
			break;

		case 2:
			driver.findElement(yearExperience2).click();
			break;
		case 3:
			driver.findElement(yearExperience3).click();
			break;
		case 4:
			driver.findElement(yearExperience4).click();
			break;
		case 5:
			driver.findElement(yearExperience5).click();
			break;
		case 6:
			driver.findElement(yearExperience6).click();
			break;
		case 7:
			driver.findElement(yearExperience7).click();
			break;

		}
		driver.findElement(date1).sendKeys(sdf.format(d1));
		driver.findElement(profession).click();
		driver.findElement(autoTools).click();

		driver.findElement(continentItems).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"continents\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		while (!text.contains("South")) {

			if (pCount == 8) {
				break;
			}
			pTestUtil.pressKeyDown(continentItems);
			pTestUtil.pressKeyEnter(continentItems);
			// Thread.sleep(5000);
			script = "return document.getElementById(\"continents\").value;";
			text = (String) js.executeScript(script);
			System.out.println(text);
			pCount++;
			// driver.findElement(continentItems).click();
		}

		if (pCount == 8) {
			System.out.println("The item is not present");
		}

		Select dropdown = new Select(driver.findElement(selCommands));
		dropdown.selectByIndex(1);
		Thread.sleep(5000);
		dropdown.selectByVisibleText("Wait Commands");
		Thread.sleep(5000);

		// Upload Image

		String projectPath = System.getProperty("user.dir");
		String uploadPath = projectPath + prop.getProperty("uploadFile");
		driver.findElement(photo).sendKeys(uploadPath);
		
		
		driver.findElement(button1).click();

	}

}
