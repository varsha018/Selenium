package com.seleniumbasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {

		//HtmlUnit Driver is also called Ghost Driver, Headless Browser,
		//It is not available from selenium 3.x..you have to import jar file from google
		//It does not opens up the browser and performs the actions..
		//It is quite fast..
		//testing happening behind the scene ..no browser launched..
		//not suitable for action class..user actions..drag and drop..select class..double click .. any complex operation..
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();
		
	// Replace ChromeDriver() by HtmlUnitDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		
		driver.get("https://www.amazon.com"); //The current URL you are working on...
		
		System.out.println("the title of amazon page is : " + driver.getTitle());
		
		Thread.onSpinWait();
		
		driver.navigate().to("https://www.google.com"); 
		
		System.out.println("the title of google page is : " + driver.getTitle());

	}

}
