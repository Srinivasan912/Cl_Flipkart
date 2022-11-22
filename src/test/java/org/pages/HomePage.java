package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement SearchText;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SearchBtn;
	@FindBy(xpath="//div[text()='My Account']")
	private WebElement MyAccount;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement Logout;
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement Mobiles;
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement AddToCard;
	
	
	
	public WebElement getAddToCard() {
		return AddToCard;
	}
	public WebElement getMobiles() {
		return Mobiles;
	}
	public WebElement getSearchText() {
		return SearchText;
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	public WebElement getMyAccount() {
		return MyAccount;
	}
	public WebElement getLogout() {
		return Logout;
	}
	

}
