package introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinksRahul {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step1 is to get all the Urls tied up 	to the links using selenium
		// Java methods will call URL's and gets to the you the status code
		// if status code >400 then the url is not working-> link which tied to url is broken
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		HttpURLConnection huc = (HttpURLConnection) new URL(url).openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();
		int resCode = huc.getResponseCode();
		System.out.println(resCode);*/
		   List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		      SoftAssert a =new SoftAssert();

		     

		      for(WebElement link : links)

		      {

		          String url= link.getAttribute("href");

		         

		          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

		          conn.setRequestMethod("HEAD");

		          conn.connect();

		          int respCode = conn.getResponseCode();

		          System.out.println(respCode);

		          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

		

		      }

		     

		      a.assertAll();

		   

		    

		         
	}

}
