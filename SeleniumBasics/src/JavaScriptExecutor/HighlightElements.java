package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElements {

	public static void main(String[] args) throws IOException {
		
		//JavaScriptExecuter is an Interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com"); //The current URL you are working on...
		
		//	driver.findElement(By.id("nav-search-submit-text")).click();
		
		WebElement search = driver.findElement(By.xpath("//button[@type ='submit']"));
		
		//flash using javascript Executor
		
		flash(search , driver);
		
		//draw border using javascript Executor
		
		drawBorder(search , driver);
		
		//Tke screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src , new File("C:\\Users\\admin\\git\\SeleniumBasics\\SeleniumBasics\\src\\Screenshots\\FbloginBorder1.png"));
		
		//Generate alert if you want to alert developers about the bug...
		
		// generateAlert(driver, "The login page has some issue, click disabled");
		
		//click on element ,even if issue is there..
		
		clickElementbyJS(search , driver);
		
		System.out.println("search element clicked");
		
		//to refresh browser in selenium
		
		// driver.navigate().refresh();
		
		
		//to refresh browser by JS executor..
		
		refreshbrowserbyJS(driver);
		
		System.out.println("web page refreshed");
		
		//get title of page by JS
		
		String t1 = getTitlebyJS(driver);
		System.out.println("the title as per JS is : " + t1);
		
		//to get text of entire webpage by JS Executor
		
		System.out.println(getInnerTextbyJS(driver));;
		
		


	}
	
	
	//****************************main method ends here***************************
	
	//****JavaScriptExecutor***************
	
	//**Methods 
	
	
	//to flash on any element...
	public static void flash(WebElement element , WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0 ; i<10; i++) {
			changeColor("rgb(0,200,0)", element , driver);
			changeColor(bgcolor, element , driver);
		}
	}
	
	//to change color 
	public static void changeColor(String color , WebElement element , WebDriver driver ) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , element);
	
		  try { 
		  Thread.sleep(20); 
		  } catch(InterruptedException e){
		  System.out.println("exception caught"); }
	 
	}
	
	//to draw border
	public static void drawBorder(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border = '5px solid red'" , element);
		
	}
	
	//togenerateAlert
	public static void generateAlert(WebDriver driver , String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	//to click on element..when we get staleElement Exception or element not clickable
	//javascript executor deals with html directly and is very fast..
	
	public static void clickElementbyJS(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
		
	}
	
	//To refresh the browser
	public static void refreshbrowserbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	//To get title of webpage
	public static String getTitlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title; ").toString();
		return title;
	}
	
	//To get entire text of the page
	public static String getInnerTextbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
		
		
	}
	
	
	
	

}
