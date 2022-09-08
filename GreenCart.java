package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoking the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver = "\C:\\Users\\sumeet\\Downloads\\chromedriver_win32\"
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/seleniumPractise/";
		driver.get(url);
	}

}
