package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver = "\C:\\Users\\sumeet\\Downloads\\chromedriver_win32\"
		WebDriver driver = new ChromeDriver();
		String url ="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		driver.findElement(By.id("autosuggest")).sendKeys("hon");
		Thread.sleep(2000);
		List <WebElement> options = driver.findElements(By.cssSelector("li[class= \"ui-menu-item\"] a"));
		for(WebElement option:options)
		{
		   if (option.getText().equalsIgnoreCase("hong kong"))
		   {
			   option.click();
			   break;
		   }
		}
			
	
	}

}
