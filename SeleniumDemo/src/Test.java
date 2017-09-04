
import org.openqa.selenium.WebDriver;

import commonObject.UseBrowser;

import pageObject.BaiduIndexPage;

public class Test {

	public static void main(String[] args)throws Exception {
		WebDriver driver;
		BaiduIndexPage page = new BaiduIndexPage();
		UseBrowser ub = new UseBrowser();
		driver = ub.setupIE("http://www.baidu.com");
		page.click_Search_Bar(driver);
		page.input_Search_Box(driver, "selenium test");
		page.click_Search_Button(driver);
		ub.teardownBrowser();
	}

}
