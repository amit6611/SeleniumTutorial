package introduction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Invoking browser
		// Chrome-> ChromeBrowser class-> methods
		//ChromeDriver driver = new ChromeDriver();
		//Chromedriver.exe - Chrome browser
		//webdriver.chrome.driver -> value of path of exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver = "\C:\\Users\\sumeet\\Downloads\\chromedriver_win32\"
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
