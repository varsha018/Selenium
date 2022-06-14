package com.seleniumbasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {   //to get list of webelements ..generally we use tag name..and findElements...

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		driver.get("https://www.ebay.com/");
		
		//to know the count of links... we know all links have "a" as html tag..search by Tagname..
		//hover on findElements you will find the return type is ..List<WebElement> ..
		//so import list from java and webelement from selenium..
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("number of links in the page : " + links.size());
		
		List <WebElement> input_field = driver.findElements(By.tagName("input"));
		
		System.out.println("number of input fields in the page : " + input_field.size());
		
		
		//to iterate all links..
		
		/*
		 * Iterator<WebElement> l1= links.iterator();
		 * 
		 * while(l1.hasNext()) { WebElement wb = l1.next();
		 * System.out.println(wb.getText()); }
		 */
		
		
		Iterator<WebElement> i1= input_field.iterator();
		
		while(i1.hasNext()) {
			 WebElement wb1 = i1.next();
			System.out.println(wb1.getText());
		}
		
		System.out.println("program ended");
		
		
		/*
		 * //for loop:>>> to get text of links use >> 
		 * gettext() 
		 * for(int i=0 ;
		 * i<links.size(); i++) 
		 * { System.out.println(links.get(i).getText());
		 * 
		 * }
		 */
		
			
			
		
		
		
		
	}

}
