package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcepts {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Actions action = new Actions(driver);
		
		//with Actions class you have to write build and perform method...
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))).build().perform();
		
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		
		

	}

}
