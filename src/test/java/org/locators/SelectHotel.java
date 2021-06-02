package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "radiobutton_0"), @FindBy(xpath = "//input[@name='radiobutton_0']") })
	private WebElement radio;

	@FindAll({ @FindBy(id = "continue"), @FindBy(xpath = "//input[@name='continue']") })
	private WebElement btnconti;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtnconti() {
		return btnconti;
	}

}
