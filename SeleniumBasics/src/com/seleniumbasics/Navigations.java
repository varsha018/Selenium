package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {   //when you want to jump from one website to another website and navigate back and forth..

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		
		driver.get("https://www.amazon.com"); //The current URL you are working on...
		
		driver.navigate().to("https://www.google.com");  //Navigate.to >> when you want to move to some extrnal URL from your current URL..
		
		//back and forward simulation...
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh(); //to refersh the webpage.
		
		
		
		
		

	}

}
