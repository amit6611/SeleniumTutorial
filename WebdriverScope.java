package introduction;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class WebdriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement ColumnDriver = footerDriver.findElement(By.xpath("//tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
	
		for(int i =1;i<ColumnDriver.findElements(By.tagName("a")).size();i++) {
			String ClickONLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickONLinkTab);
			
					}
		Set<String> OpenTabs = driver.getWindowHandles();
		Iterator<String> Id = OpenTabs.iterator();
		while(Id.hasNext()){
			System.out.println(driver.switchTo().window(Id.next()).getTitle());
			
		}
	}

}
