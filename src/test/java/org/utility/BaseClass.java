package org.utility;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();	
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		return driver;
		}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitwait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String title() {
		String title = driver.getCurrentUrl();
		return title;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void windowsHandler(int tab) {
		Set<String> ss = driver.getWindowHandles();
		List<String> l= new ArrayList<String>(ss);
		driver.switchTo().window(l.get(tab));
	}
	
	public static String  getAttribute(WebElement e) {
		String att=e.getAttribute("value");
		return att;		
	}
	
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	public static String getText(WebElement t) {
		String txt = t.getText();
		return txt;

	}
	public static void explicitWait(long secs) {
		WebDriverWait w = new WebDriverWait(driver, secs);
	}
	
	//	public static void sleep(long secs) throws InterruptedException {
//		Thread.sleep(secs);
//	}
	
}
