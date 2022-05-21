package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//whenever frames are available in any webpage.. right click on mouse..view page source..if iframe tag is there..then there are frames avaliable..
		//as per w3c ..they are not recomending to use frames.. now developers don't use frames in web page...
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));  //switch to frame if it is present...
		
		Actions ar = new Actions(driver);
		
		//Drag and Drop
		
		//click and hold the element you want to drag>>move to element where you want to drop>> release >> build and perform...
		
		ar.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
		
		
		
		
		
		
		

	}

}
