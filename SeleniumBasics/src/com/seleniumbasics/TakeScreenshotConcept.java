package com.seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;  // add this jar for FileUtils for screenshot 
			

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout(); 
		driver.manage().timeouts().getPageLoadTimeout(); //page load timeout is dynamic wait..
		
		driver.get("https://www.amazon.com"); //The current URL you are working on...
		
		/*
		 * //take screenshot and store as file format 
		 * //for using FileUtils to take screenshot in selenium.. download from here:
		 *  ***************https://commons.apache.org/proper/commons-io/download_io.cgi****************
		 *
		 */		
		
		//By GetScreenshotAs method we can take screenshot in selenium...
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src , new File("C:\\Users\\admin\\git\\SeleniumBasics\\SeleniumBasics\\src\\Screenshots\\amazonlogin.png"));

	}

}
