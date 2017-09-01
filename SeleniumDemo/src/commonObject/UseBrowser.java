/**
 * 
 */
/**
 * @author libin
 *
 */
package commonObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UseBrowser{
	public WebDriver driver;
	public WebDriver setupChrome(String test_url){
//		String path="C:\\Users\\Administrator.PC-20170725OIYG\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
		String path="E:/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get(test_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public WebDriver setupFirefox(String test_url){
		String path="D:\\Program Files\\Mozilla Firefox\\firefox.exe";
		System.setProperty("webdriver.firefox.bin",path);
		String path1 = "D:\\Program Files\\Mozilla Firefox\\geckodriver.exe";
		System.setProperty("webdriver.firefox.marionette",path1);
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "about:blank");
		profile.setPreference("startup.homepage_welcome_url", "about:blank");
		profile.setPreference("startup.homepage_welcome_url.additional", "about:blank");
		
		driver = new FirefoxDriver(profile);
		driver.get(test_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public WebDriver setupIE(String test_url){
//		String path = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String path = "E:/drivers/IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",path);
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(dc);
		driver.get(test_url);
		return driver;
	}
	public void teardownBrowser(){
		driver.close();
	}
}