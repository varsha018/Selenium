package ParentSiblingXpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws Exception  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		Thread.sleep(100);
		
		Alert ar = driver.switchTo().alert();
		
		ar.accept();
		
		//driver.findElement(By.name("identifier")).sendKeys("guptavarsha018@gmail.com");
		
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		
		
		
		
		

	}

}
