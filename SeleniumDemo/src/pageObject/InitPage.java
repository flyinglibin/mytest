/**
 * @author libin
 *
 */

package pageObject;

import org.openqa.selenium.support.PageFactory;


import commonObject.InitPre;

public class InitPage extends InitPre{
	private BaiduIndexPage1 baidu ;
	public InitPage(String test_url) {
		super(test_url);
		baidu = PageFactory.initElements(this.driver, BaiduIndexPage1.class);
	}

	public BaiduIndexPage1 get_BaiduIndexPage1(){
		return baidu;
	}
	public String get_Title(){
		return this.driver.getTitle();
	}
	
	public boolean is_baidu_loaded(){
		return baidu.get_page_title().equals(get_Title());
	}
}
