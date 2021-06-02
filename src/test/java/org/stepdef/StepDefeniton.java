package org.stepdef;

import org.baseclass.BaseClass;
import org.locators.BookHotel;
import org.locators.LoginPage;
import org.locators.Search;
import org.locators.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefeniton extends BaseClass {
	LoginPage l;
	Search sc;
	SelectHotel s;
	BookHotel bh;

	@Given("User is on adactin Page #browser ,url-->predefined")
	public void user_is_on_adactin_Page_browser_url_predefined() {
		getDriver();
		launchUrl("http://adactinhotelapp.com/");

	}

	@When("User need to enter {string} and {string} on home page")
	public void user_need_to_enter_and_on_home_page(String username, String password) {
		l = new LoginPage();
		type(l.getTxtUserName(), username);
		type(l.getPassword(), password);
	}

	@When("User need to click login")
	public void user_need_to_click_login() {
		click(l.getBtnLogin());
	}

	@When("User need to search by selecting {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_search_by_selecting(String location, String hotel, String roomType, String NoofRoom,
			String checkInDate, String checkOutDate, String Adults, String Children) {
		sc = new Search();
		selectByText(sc.getLocation(), location);
		selectByText(sc.getHotels(), hotel);
		selectByText(sc.getRoomType(), roomType);
		selectByText(sc.getRoomNos(), NoofRoom);
		clear(sc.getDatePickIn());
		type(sc.getDatePickIn(), checkInDate);
		clear(sc.getDatePickOut());
		type(sc.getDatePickOut(), checkOutDate);
		selectByText(sc.getAdultRoom(), Adults);
		selectByText(sc.getChildRoom(), Children);
	}

	@When("Click the Search")
	public void click_the_Search() {
		click(sc.getSubmit());
	}

	@When("User need to select Hotel")
	public void user_need_to_select_Hotel() {
		s = new SelectHotel();
		click(s.getRadio());
    }

	@When("click on Continue")
	public void click_on_Continue() {
		click(s.getBtnconti());
	}

	@When("User need to enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_enter(String firstname, String lastname, String address, String cardNo, String cardtype,
			String expMonth, String expYear, String cvv) {
		bh = new BookHotel();
		type(bh.getFrstName(), firstname);
		type(bh.getLastName(), lastname);
		type(bh.getAddress(), address);
		type(bh.getCardNum(), cardNo);
		selectByText(bh.getCardType(), cardtype);
		selectByText(bh.getMonth(), expMonth);
		selectByText(bh.getYear(), expYear);
		type(bh.getCvv(), cvv);
	}

	@When("User need to click Book Now option")
	public void user_need_to_click_Book_Now_option() {
		click(bh.getBookNow());
	}

	@Then("Finally user is on Confirmation page")
	public void finally_user_is_on_Confirmation_page() {
		System.out.println("booking confirmed");
	}

}
