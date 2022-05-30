package GoogleSearchTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDynamicSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
	//	List<WebElement> list =driver.findElements(By.xpath("//ul[@role ='listbox']//li/descendant::div[@class='pcTkSc']"));
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[@class ='erkvQe']//div[@class='OBMEnb']//ul//li/descendant::div[@class='wM6W7d']"));
		
		System.out.println(list.get(0).getText());
		
		/*
		 * System.out.println("the size of list in google search is : " + list.size());
		 * 
		 * for( int i=0 ; i <list.size() ;i++ ) {
		 * System.out.println(list.get(i).getText());
		 * 
		 * if(list.get(i).getText().contains("testing tools")) { list.get(i).click();
		 * break;
		 * 
		 * } }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
