package introduction;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions(); // to set the behavior of chrome browser
		//For Firefox - FirefoxOptions options = new FirefoxOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:2222"); // it will arguments as "ip address:code number".
		options.setCapability("proxy", proxy);// to set up proxy but we have to set proxy java class
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);// to bypass the insecure certifications
		options.addExtensions();// it will take argument as the file path of that extensions
		
		/*ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));*/   //to disable unwanted pop-ups like "allow your location"
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);// to give the knowledge of options behavior
		//to chrome driver by passing the arguments "Options"
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionkey"); // to delete seesion
		//key so after that if we click anywhere it will logout.
	}

}
