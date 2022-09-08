package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver = "\C:\\Users\\sumeet\\Downloads\\chromedriver_win32\"
		WebDriver driver = new ChromeDriver();
		String url ="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		//Webelement Staticdropdown = driver.findElement(By.id("divAdult"));
		//Select dropdown = new Select(Staticdropdown);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		/*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			}
	       
	
}

