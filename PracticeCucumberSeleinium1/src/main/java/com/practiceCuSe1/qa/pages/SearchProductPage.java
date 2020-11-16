package com.practiceCuSe1.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.practiceCuSe1.qa.base.PracTestBase;
import com.practiceCuSe1.qa.util.PracTestUtil;

public class SearchProductPage extends PracTestBase {

	By womenTab = By.cssSelector("div#block_top_menu ul li:nth-child(1) a");
	By tshirtLink = By.cssSelector("div#block_top_menu ul li:nth-child(1) ul li:nth-child(1) ul li:nth-child(1) a");
	By productName = By.cssSelector("div#center_column ul li div div.right-block h5");
	By searchField = By.cssSelector("input#search_query_top");
	By searchButton = By.cssSelector("button.btn.btn-default.button-search");
	By searchedItem = By.cssSelector("div#center_column ul li div div.right-block h5 a");
	String textFirstProduct;

	public void moveCursorOverWomenLinkAndClickSubMenuTshirts() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(womenTab));
		act.moveToElement(driver.findElement(tshirtLink)).click().build().perform();
		
	}
	
	public void getTextOfFirstProductDisplayedOnPage() {
		textFirstProduct=driver.findElement(productName).getText();
		System.out.println("ProductName: "+ textFirstProduct);
	}
	
	public void enterSameProductNameInSearchFieldAndClickSearchButton() {
		driver.findElement(searchField).sendKeys(textFirstProduct);
		driver.findElement(searchButton).click();
	}
	
	public void validateSameProductDisplayedOnSearchedPageWithSameDetailsWhichDisplayedOnTshirtsPage() {
		WebDriverWait wait1= new WebDriverWait(driver,15);
		wait1.until(ExpectedConditions.textToBePresentInElementLocated(searchedItem, textFirstProduct));
		System.out.println("SearchedItem" +driver.findElement(searchedItem).getText());
	}
	
}
