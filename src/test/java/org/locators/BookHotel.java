package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "first_name"), @FindBy(xpath = "//input[@name='first_name']") })
	private WebElement frstName;

	@FindAll({ @FindBy(id = "last_name"), @FindBy(xpath = "//input[@name='last_name']") })
	private WebElement lastName;

	@FindAll({ @FindBy(id = "address"), @FindBy(xpath = "//textarea[@name='address']") })
	private WebElement address;

	@FindAll({ @FindBy(id = "cc_num"), @FindBy(xpath = "//input[@name='cc_num']") })
	private WebElement cardNum;

	@FindAll({ @FindBy(id = "cc_type"), @FindBy(xpath = "//select[@name='cc_type']") })
	private WebElement cardType;

	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(xpath = "//select[@name='cc_exp_month']") })
	private WebElement month;

	@FindAll({ @FindBy(id = "cc_exp_year"), @FindBy(xpath = "//select[@name='cc_exp_year']") })
	private WebElement year;

	@FindAll({ @FindBy(id = "cc_cvv"), @FindBy(xpath = "//input[@name='cc_cvv']") })
	private WebElement cvv;

	@FindAll({ @FindBy(id = "book_now"), @FindBy(xpath = "//input[@name='book_now']") })
	private WebElement bookNow;

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
