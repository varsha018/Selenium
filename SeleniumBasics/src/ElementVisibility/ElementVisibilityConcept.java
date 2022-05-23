package ElementVisibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com"); //The current URL you are working on...
		
		
		
		//isDisplayed  // whether element is displayed on page or not..
		Boolean grp = driver.findElement(By.linkText("Groups")).isDisplayed();  //isDisplayed returns boolean
		System.out.println(grp);
		
		//isEnabled  >>whether buttons are enabled or disabled
		Boolean login = driver.findElement(By.xpath("//button[@type = 'submit']")).isEnabled();
		System.out.println(login);
		
		//isSelected  >> only for dropdown , radio button , checkbox..if selected returns true ..else false
		
		driver.navigate().to("https://api.freecrm.com/register/");
		
		Boolean checkbox = driver.findElement(By.name("terms")).isSelected();
		
		System.out.println(checkbox);
		
		
		
	}

}
