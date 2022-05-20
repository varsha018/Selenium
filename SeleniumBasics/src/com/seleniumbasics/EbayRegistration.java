package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();

		driver.get("https://www.ebay.com/");

		String title = driver.getTitle();
		System.out.println(title);
		
//		driver.findElement(By.linkText("Sign in")).click();   //link text locator ..has "a" as html tag
//		driver.findElement(By.partialLinkText("customer service ")).click(); // give partial value of link text..  has "a" as html tag
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("books"); //when you inspect on element..in html blue highlighted block>>right click>>copy selector...
																		//most of times, when name or id is available..put # before the name or id value..that will be your css selector.. 
		
		
//		driver.quit();

	}

}
