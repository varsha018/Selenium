package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkConcept {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();  
												//chromedrive is a "class" which is implementing webdriver "interface"
												//parent interface(webdriver) referece variable(driver) calling class object >> dynamic polymorphism....
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		driver.get("https://www.amazon.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("The total number of links available are : " + links.size());
		
		List<WebElement> Activelinks = new ArrayList<WebElement>();
		
		
		
		for(int i =0 ; i< links.size();i++) {
			
			System.out.println(links.get(i).getAttribute("href"));
			if(links.get(i).getAttribute("href") != null && (!links.get(i).getAttribute("href").contains("javascript"))) {
				Activelinks.add(links.get(i));
				
			}
		}
		
		System.out.println("The number of Active Links are  : " + Activelinks.size());
		
		
		
		for(int j =0 ; j< Activelinks.size() ; j++) {
			
			
			HttpURLConnection connection =	(HttpURLConnection)new URL(Activelinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(Activelinks.get(j).getAttribute("href") + "------>> " + response);
			
		}
		
		
		/*
		 * Iterator<WebElement> it = links.iterator();
		 * 
		 * while(it.hasNext()) { String li = it.next().getText();
		 * System.out.println(li); }
		 */
		
	

	}

}
