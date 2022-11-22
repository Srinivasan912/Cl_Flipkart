package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='New to Flipkart? Create an account']")
	private WebElement register;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtemail;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnlogin;
	@FindBy(xpath="//button[text()='✕']")
	private WebElement btnclose;
	
	
	public WebElement getValid() {
		return valid;
	}
	public WebElement getInvalid() {
		return invalid;
	}
	public WebElement getBtnclose() {
		return btnclose;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	

}
