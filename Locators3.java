package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver = "\C:\\Users\\sumeet\\Downloads\\chromedriver_win32\"
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//sibling - child to parent traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println( driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
