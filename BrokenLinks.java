package introduction;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.deadlinkcity.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);
		List <WebElement> linkedlist = driver.findElements(By.tagName("a"));
		int resCode =200;
		int brokenlinkcnt =0;
		for (WebElement element:linkedlist)
		{
			String uRl = element.getAttribute("href");
			
			try {
				URL urllink = new URL(uRl);
				HttpURLConnection huc = (HttpURLConnection) urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				resCode = huc.getResponseCode();
				
				if(resCode>=400)
				{
					//System.out.println(url + "broken link");
					brokenlinkcnt++;
				}
			}
			catch(MalformedURLException e) {}
			
			catch(Exception e)
			{
				
			}
			
		}
		System.out.println("Number of broken links - " + brokenlinkcnt);		
		
	}
}	
	


