package org.main;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.pages.RegisterPage;
import org.utility.BaseClass;

public class Execution extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("Chrome");
		maximize();
		implicitwait(10);
		urlLaunch("https://www.flipkart.com/");
		WebDriverWait w = new WebDriverWait(driver, 20);
		LoginPage l = new LoginPage();
		w.until(ExpectedConditions.visibilityOf(l.getRegister())).click();	
		RegisterPage r = new RegisterPage();
		WebElement username = w.until(ExpectedConditions.visibilityOf(r.getEmail()));
		sendkeys(username, "9159162176");
		w.until(ExpectedConditions.visibilityOf(r.getBtnRegister())).click();
		 WebElement pass = w.until(ExpectedConditions.visibilityOf(l.getTxtpass()));
		sendkeys(pass, "9876543210");
		w.until(ExpectedConditions.visibilityOf(l.getBtnlogin())).click();
		HomePage h = new HomePage();
		WebElement searchtext = w.until(ExpectedConditions.visibilityOf(h.getSearchText()));
		sendkeys(searchtext, "Redmi Mobiles");
		click(h.getSearchBtn());
		w.until(ExpectedConditions.visibilityOf(h.getMobiles())).click();
		windowsHandler(1);
		click(h.getAddToCard());
		
	}

}