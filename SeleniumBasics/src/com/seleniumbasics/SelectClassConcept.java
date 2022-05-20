package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();

		driver.get("https://www.ebay.com/");

		//Select is a class
		//create object of Select class and import...
		
		Select s1 = new Select(driver.findElement(By.name("_sacat"))); //import Select from selenium and give the xpath of field which has dropdown..
		s1.selectByVisibleText("Everything Else");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		//when you use java script with selenium..you need to have protactor..it is a tool created on top of selenium.. 
		

	}

}
