package com.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		
		driver.get("https://www.amazon.com"); //The current URL you are working on...
		
		
		clickOn(driver , driver.findElement(By.xpath("//span[contains(text(),'Deliver to')]")) , 2);
		
		
	}
	
	
	//Explicit wait defined method...
	
	public static void clickOn(WebDriver driver , WebElement locator , int timeout) {
		new WebDriverWait (driver , Duration.ofSeconds(2)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
