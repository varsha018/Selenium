package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		driver.get("https://www.ebay.com/");
		
		
		// Absolute xpath: performance issue, not reliable..can be changed anytime, very slow..NOT RECOMMENDED
		
		
		
//		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("books");
	
		//contains function>>>> //tagname[contains(@field,'value')]
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("selenium");
		
		/*
		 * //starts-with function>>>> //tagname[starts-with(@field,'value')]
		 * driver.findElement(By.xpath("//input[starts-with(@type,'text_')]")).sendKeys(
		 * "selenium");
		 * 
		 * //ends-with function>>>> //tagname[ends-with(@field,'value')]
		 * driver.findElement(By.xpath("//input[ends-with(@type,'_text')]")).sendKeys(
		 * "selenium");
		 */
		
		//text() method inside contains() function..
		//for links..html tag is "a" for all links
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
	}

}
