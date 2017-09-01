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
	public void click_Search_Bar(WebDriver driver)throws Exception{
		driver.findElement(By.id(search_bar_id)).click();
		System.out.println("focus on sucess... ");
	}
	//input search text
	public void input_Search_Box(WebDriver driver , String key_word){
		driver.findElement(By.id(search_box_id)).clear();
		driver.findElement(By.id(search_box_id)).sendKeys(key_word);
		System.out.println("�ٶ������ɹ��������ݣ�" + key_word);
	}
	public void click_Search_Button(WebDriver driver){
		driver.findElement(By.id(search_button_id)).click();
		System.out.println("click �ٶ�һ�£�sucessful������");
	}
}