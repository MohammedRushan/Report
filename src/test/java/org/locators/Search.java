package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass {

	public Search() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "location"), @FindBy(xpath = "//select[@name='location']") })
	private WebElement location;

	@FindAll({ @FindBy(id = "hotels"), @FindBy(xpath = "//select[@name='hotels']") })
	private WebElement hotels;

	@FindAll({ @FindBy(id = "room_type"), @FindBy(xpath = "//select[@name='room_type']") })
	private WebElement roomType;

	@FindAll({ @FindBy(id = "room_nos"), @FindBy(xpath = "//select[@name='room_nos']") })
	private WebElement roomNos;

	@FindAll({ @FindBy(id = "datepick_in"), @FindBy(xpath = "//input[@name='datepick_in']") })
	private WebElement datePickIn;

	@FindAll({ @FindBy(id = "datepick_out"), @FindBy(xpath = "//input[@name='datepick_out']") })
	private WebElement datePickOut;

	@FindAll({ @FindBy(id = "adult_room"), @FindBy(xpath = "//select[@name='adult_room']") })
	private WebElement adultRoom;

	@FindAll({ @FindBy(id = "child_room"), @FindBy(xpath = "//select[@name='child_room']") })
	private WebElement childRoom;

	@FindAll({ @FindBy(id = "Submit"), @FindBy(xpath = "//input[@name='Submit']") })
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
