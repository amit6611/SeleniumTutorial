package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AsssertCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily")).isSelected());
		//Counting number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
	}

}
