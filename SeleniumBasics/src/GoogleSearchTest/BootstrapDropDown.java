package GoogleSearchTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		//HeadLess Browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		
		
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		scrollDownbyJS(driver);
		
		List<WebElement> list =driver.findElements(By.xpath("//div[@id='lang-chooser']//div//div//div//div[@jsname='ksKsZd']"));
		
		System.out.println(list.size());
		
		for(int i=0 ; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		
		
		
		
		

	}
	
	//to scroll down till last of the page..
	public static void scrollDownbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
