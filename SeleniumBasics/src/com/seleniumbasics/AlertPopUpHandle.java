package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
	//	Thread.sleep(1000); //to wait 
		
		//Alert is an API ..you don't ive new keyword..
		
		Alert a1 = driver.switchTo().alert(); //switch to alert pop up first and create object reference for that alert by importing Alert from selenium..
		
		String sr = a1.getText();//create obj reference and use it...
		System.out.println(sr); //whatever text is there on pop up,that will be fetched
		
		
		if(sr.equals("Please enter a valid user name")){
			System.out.println("correct error message");	
		}else {
			System.out.println("incorrect message");
		}
		
		
		a1.accept(); //if you want to accept the popup
		
	//	a1.dismiss();//f you want to dismiss the popup
		
		
		

	}

}
