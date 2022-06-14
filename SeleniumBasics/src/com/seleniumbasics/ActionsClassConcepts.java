package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcepts {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Actions action = new Actions(driver);
		
		//with Actions class you have to write build and perform method...
		

		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))).build().perform();
		
		Thread.sleep(20);
		
		driver.switchTo().frame("DAsis");
		
		
		//ac.moveToElement(Hello_SignIn).build().perform();

		
		//driver.switchTo().frame("DAsis");
		Thread.sleep(20);
		
		driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content']//span[@class='nav-action-inner']")).click();
		
	  //driver.findElement(By.xpath("//div[@class='nav-signin-tt nav-flyout']//span[@class='nav-action-inner']")).click(); >>first hello signIN
		
		//driver.findElement(By.xpath("//span[text()='Account']")).click();
		
		

	}

}
