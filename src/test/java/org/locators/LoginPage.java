package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() { 
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "username"), @FindBy(xpath = "(//input[@class='login_input'])[1]") })
	private WebElement txtUserName;

	@FindAll({ @FindBy(id = "password"), @FindBy(xpath = "(//input[@class='login_input'])2]") })
	private WebElement password;

	@FindAll({ @FindBy(id = "login"), @FindBy(xpath = "(//input[@name='login']") })
	private WebElement btnLogin;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getPassword() {
		return password;
	}

	

}
