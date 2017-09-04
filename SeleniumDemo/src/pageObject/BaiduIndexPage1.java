/**
 * 
 */
/**
 * @author libin
 *
 */
package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pagePath.PageElementPath;

public class BaiduIndexPage1 extends PageElementPath{
	// click the search area
	@FindBy(id = search_bar_id)
	private WebElement search_bar;
	
	@FindBy(id = search_box_id)
	private WebElement search_box;
	
	@FindBy(id = search_button_id)
	private WebElement search_button;
	
	public void click_Search_Bar(){
		search_bar.click();
		System.out.println("focus on sucess... ");
	}
	//input search text
	public void input_Search_Box( String key_word){
		search_box.sendKeys(key_word);
		System.out.println("百度输入框成功输入内容：" + key_word);
	}
	public void click_Search_Button(){
		search_button.click();
		System.out.println("click 百度一下，sucessful。。。");
	}
}