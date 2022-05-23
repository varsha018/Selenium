package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownbyJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com"); //The current URL you are working on...
		
		//scrollDownbyJS(driver);
		
		WebElement grp = driver.findElement(By.linkText("Groups"));
		
		scrollIntoView(grp,driver);
		

	}

	//to scroll down till last of the page..
	public static void scrollDownbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//to scroll till that specific element is visible..
	public static void scrollIntoView(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	
	
	
}
