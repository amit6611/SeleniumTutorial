package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/angularpractice/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Amit");
		driver.findElement(By.name("email")).sendKeys("amit661134@yahoo.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("yahoo");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("23-02-1996");
		driver.findElement(By.xpath("//input[@class = 'btn btn-success']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
