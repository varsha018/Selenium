package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class CalenderDateByJS {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.spicejet.com/");
		
		WebElement dateSelected = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		
		String DateValue = "Fri, 20 Jun 2022";
		
		System.out.println("before script");
		
		SelectDateByJS(driver , dateSelected , DateValue );
		
		System.out.println("after script");
		
	}
	
	//this script is for calender date value = "21-09-2022"
	
	public static void SelectDateByJS(WebDriver driver , WebElement element , String DateValue) {
	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+DateValue+"');", element);
		
	}
	


}
