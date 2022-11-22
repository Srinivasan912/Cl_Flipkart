package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement ProductText;
	@FindBy(xpath="")
	private WebElement ProductPrice;
	public WebElement getProductText() {
		return ProductText;
	}
	public WebElement getProductPrice() {
		return ProductPrice;
	}
}
