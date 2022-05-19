package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCalling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		  //WebDriver is an Interface
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		driver.get("https://www.amazon.com");

		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		
		
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		
		
		
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		
//		driver.findElement(By.xpath("//a[text()= 'Advanced Search' ]")).click();
		
		driver.quit();
		
		
		

	}

}
