package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(url);
		String option =driver.findElement(By.xpath("//input[@value='option2']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		System.out.println(option);
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		//Thread.sleep(5000);
		String text = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		System.out.println(text);
		if(text.equals(option)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
			
		
	}

}
