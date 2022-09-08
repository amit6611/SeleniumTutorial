package introduction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://jqueryui.com/droppable/";
		driver.get(url);
		//to switch to frames by index
		//driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size()) ;
		//to switch to frames by webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class = 'demo-frame']")));
		//driver.findtlement(By.id(" aggable" .click();
		Actions a =new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//to come out from frames
		driver.switchTo().defaultContent();
		
	}

}
