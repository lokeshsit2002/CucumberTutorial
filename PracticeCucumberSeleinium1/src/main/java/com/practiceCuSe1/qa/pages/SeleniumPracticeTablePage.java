package com.practiceCuSe1.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class SeleniumPracticeTablePage extends PracTestBase {

	By structureValues = By.cssSelector("tbody tr th");
	By totalc = By.cssSelector("table tfoot tr td");
	By sBhurj = By.cssSelector("tbody tr:nth-child(1) th");
	By sClockTower = By.cssSelector("tbody tr:nth-child(2) th");
	By sTaipei = By.cssSelector("tbody tr:nth-child(3) th");
	By sFinancialCenter = By.cssSelector("tbody tr:nth-child(4) th");

	By sBhurjHeight = By.cssSelector("tbody tr:nth-child(1) td:nth-child(4)");
	By sClockTowerHeight = By.cssSelector("tbody tr:nth-child(2) td:nth-child(4)");
	By sTaipeiHeight = By.cssSelector("tbody tr:nth-child(3) td:nth-child(4)");
	By sFinancialCenterHeight = By.cssSelector("tbody tr:nth-child(4) td:nth-child(4)");

	ArrayList<WebElement> lStrucValues = new ArrayList<WebElement>();
	int strucCount;
	String[] tList;
	int strucPosition;

	public int totalStructureCount() {
		lStrucValues = (ArrayList<WebElement>) driver.findElements(structureValues);
		strucCount = 0;

		for (WebElement lSValue : lStrucValues) {
			strucCount++;
		}
		System.out.println("TotalStructureCount " + strucCount);
		return strucCount;
	}

	public int totalCount() {
		tList = driver.findElement(totalc).getText().split(" ");
		System.out.println("TotalCount " + tList[0]);

		return Integer.parseInt(tList[0]);

	}

	public void validateTheMatch() {
		Assert.assertEquals(totalStructureCount(), totalCount());
	}

	public void userFindsStructureRow(String structureName) {

		strucPosition = 0;

		if (driver.findElement(sBhurj).getText().contains(structureName)) {
			strucPosition = 1;
			System.out.println(driver.findElement(sBhurj).getText());
			System.out.println("Structure Position: " + strucPosition);
		}

		else if (driver.findElement(sClockTower).getText().contains(structureName)) {
			strucPosition = 2;
			System.out.println(driver.findElement(sClockTower).getText());
			System.out.println("Structure Position: " + strucPosition);
		}

		else if (driver.findElement(sTaipei).getText().contains(structureName)) {
			strucPosition = 3;
			System.out.println(driver.findElement(sTaipei).getText());
			System.out.println("Structure Position: " + strucPosition);
		}

		else if (driver.findElement(sFinancialCenter).getText().contains(structureName)) {
			strucPosition = 4;
			System.out.println(driver.findElement(sFinancialCenter).getText());
			System.out.println("Structure Position: " + strucPosition);
		}

		else {
			System.out.println(structureName + " Structure is not present in Table");
		}

	}

	public void validateHeightOfStructure(String structureHeight) {

		switch (strucPosition) {
		case 1:
			System.out.println(driver.findElement(sBhurjHeight).getText());
			Assert.assertEquals(driver.findElement(sBhurjHeight).getText(), structureHeight);
			break;

		case 2:
			System.out.println(driver.findElement(sClockTowerHeight).getText());
			Assert.assertEquals(driver.findElement(sClockTowerHeight).getText(), structureHeight);
			break;

		case 3:
			System.out.println(driver.findElement(sTaipeiHeight).getText());
			Assert.assertEquals(driver.findElement(sTaipeiHeight).getText(), structureHeight);
			break;

		case 4:
			System.out.println(driver.findElement(sFinancialCenterHeight).getText());
			Assert.assertEquals(driver.findElement(sFinancialCenterHeight).getText(), structureHeight);
			break;
		default:
			System.out.println("Structure is not found in the table");
		}

	}

}
