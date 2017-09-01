/**
 * 
 */
/**
 * @author libin
 *
 */
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import pagePath.PageElementPath;

public class BaiduIndexPage extends PageElementPath{
	// click the search area
	public void click_Search_Bar(WebDriver driver){
		driver.findElement(By.id(search_box_id)).click();
	}
	//input search text
	public void input_Search_Box(WebDriver driver , String key_word){
		driver.findElement(By.id(search_box_id)).clear();
		driver.findElement(By.id(search_box_id)).sendKeys(key_word);
	}
	public void click_Search_Button(WebDriver driver){
		driver.findElement(By.name(search_button_name)).click();
		System.out.println("click 百度一下，sucessful。。。");
	}
}