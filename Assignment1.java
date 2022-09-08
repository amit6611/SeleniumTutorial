package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
		Thread.sleep(1000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println((driver.findElement(By.id("checkBoxOption1")).isSelected()));
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
	}

}
