package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

	public static void main(String[] args) {
		
		//when you browse and upload a file on webpage..
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		
		/*
		 * //click on the choose file button and choose your file..a new window will
		 * open from where you can browse all files of your system..
		 * 
		 * //inspect the element/button which takes you to browse your files
		 * window...type should always be "file">>>type="file"
		 * 
		 * //in sendkeys give the loaction \\ name of your file with its extension..
		 */		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\admin\\Downloads\\varsha_work_downloads\\dataprovider.xlsx ");
		
		
		//if your element not found in the specific page.. switch to ..frame and then inspect your element...
		
	//*******************frame is overloaded..accepts integer and string values..
		
	//	driver.switchTo().frame("mainframe"); //when you want to swtch to other frame and then perform your action
		
		
		
	}

}
