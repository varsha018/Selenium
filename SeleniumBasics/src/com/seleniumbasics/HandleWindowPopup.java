package com.seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {  //windowhandle is an API
	
	//Alert
	//File Upload
	//Window Popup

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().getImplicitWaitTimeout(); 
			driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
			
			driver.get("https://chrome.google.com/webstore/category/extensions?hl=en"); //The current URL you are working on...

			
			driver.findElement(By.xpath("//div[contains(text(),'Apache JMeter Compatible')]")).click();
			
			//used in EDeals>> while adding CICs >>new window opens up.. submit>> then new window..
			//all those can be handled by windowhandler
			//Generally the advertisement popups ..
			
			Set<String> handle = driver.getWindowHandles();
			
			//for both the window you need to get the window ID..FROM parent window .. child window opens up...
			//to get values from set object.. we use iterator...
			
			
			Iterator<String> it  = handle.iterator();
			
			String parent = it.next();
			System.out.println(parent);
			
			String child = it.next();
			System.out.println(child);
			
			//Now you have both the window ID of parent and child..
			//Now you want to switch from parent to chid window..
			
			driver.switchTo().window(child);
			
			System.out.println(driver.getTitle());;
			
			driver.close(); // closes the child window and not the parent window..
							// if driver.quit is used.. it will close all the window..
			
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());;
			
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
