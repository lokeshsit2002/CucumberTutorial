package com.practiceCuSe1.qa.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.practiceCuSe1.qa.base.PracTestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProductSteps extends PracTestBase {

	public static Logger Log = LogManager.getLogger(SearchProductSteps.class.getName());

	public SearchProductSteps() {
		super();
	}

	@When("^User Move your cursor over Women's link and Click on sub menu Tshirts$")
	public void user_move_your_cursor_over_womens_link_and_click_on_sub_menu_tshirts() {
		searchProPage.moveCursorOverWomenLinkAndClickSubMenuTshirts();
	}

	@And("^User gets text of the first product displayed on the page$")
	public void user_gets_text_of_the_first_product_displayed_on_the_page() {
		searchProPage.getTextOfFirstProductDisplayedOnPage();
	}

	@And("^User enters the same product name in the search bar present on top of page and clicks search button$")
	public void user_enters_the_same_product_name_in_the_search_bar_present_on_top_of_page_and_clicks_search_button()
	{
		searchProPage.enterSameProductNameInSearchFieldAndClickSearchButton();
	}
	
	@Then("^Validate that same product is displayed on searched page with same details which were displayed on TShirt's page$")
    public void validate_that_same_product_is_displayed_on_searched_page_with_same_details_which_were_displayed_on_tshirts_page() {
		searchProPage.validateSameProductDisplayedOnSearchedPageWithSameDetailsWhichDisplayedOnTshirtsPage();
    }
}
