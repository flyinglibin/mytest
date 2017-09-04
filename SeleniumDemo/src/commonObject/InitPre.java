/**
 * @author libin
 *
 */
package commonObject;

import org.openqa.selenium.WebDriver;

public class InitPre extends UseBrowser{
	protected WebDriver driver;
	private String test_url;
	private String pageSource;
//	public InitPre(){
//		
//	}
	
	public InitPre(String test_url){
		this.test_url = test_url;
//		driver = new UseBrowser().setupChrome(this.test_url);
//		driver = new UseBrowser().setupFirefox(this.test_url);
		driver = setupIE(this.test_url);
	}
	public String get_pageSource(){
		this.pageSource = this.driver.getPageSource();
		return this.pageSource;
	}
}
