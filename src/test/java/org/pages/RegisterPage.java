package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Email;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement BtnRegister;
	
	@FindBy(xpath="//span[text()='Existing User? Log in']")
	private WebElement BtnLogin;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getBtnRegister() {
		return BtnRegister;
	}

	public WebElement getBtnLogin() {
		return BtnLogin;
	}

}
