/**
 * auth by libn
 */
package testCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.BaiduIndexPage1;
import pageObject.InitPage;

public class TestCase2 {
	public InitPage initPage;
	public BaiduIndexPage1 baidu;
	
	@Test
	public void baidu_test()throws Exception{
		baidu.click_Search_Bar();
		Thread.sleep(1000);
		baidu.input_Search_Box("测试方案");
		Thread.sleep(1000);
		baidu.click_Search_Button();
//		System.out.println(baidu.get_page_title());
		assertTrue(baidu.get_page_title().equals("测试方案_百度搜索"));
		Thread.sleep(10000);
	}
// ��������	
	@DataProvider(name="searchData")
	public static Object[][] data(){
		return new Object[][]{
				{"老九门","演员","赵丽颖"},
				{"X战警天启","导演","布莱恩·辛格"},
				{"诛仙青云志","编剧","张戬"}
		};
	}
	@Test(dataProvider="searchData")
	public void baidu_test(String searchdata1,String searchdata2,String searchResult){
		baidu.click_Search_Bar();
		baidu.input_Search_Box(searchdata1+ " " + searchdata2);
		baidu.click_Search_Button();
		assertTrue(initPage.get_pageSource().contains(searchResult));
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod sucess...");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("AfterMethod sucess...");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass sucess...");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("AfterClass sucess...");
	}
	@BeforeTest
	public void BeforeTest(){
		System.out.println("BeforeTest sucess...");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest sucess...");
	}
	@BeforeSuite
	public void BeforeSuite(){
		//
		initPage = new InitPage("http://www.baidu.com");
		assertTrue(initPage.is_baidu_loaded());
		assertEquals(initPage.is_baidu_loaded(),true);
		if(initPage.is_baidu_loaded()){
			System.out.println("initPage  baidu sucessful...");
		}
		baidu = initPage.get_BaiduIndexPage1();
		assertEquals(baidu.get_page_title().equals("百度一下，你就知道"),true);
		System.out.println("BeforeSuite sucess...");
	}
	@AfterSuite
	public void afterSuite(){
        initPage.teardownBrowser();
		System.out.println("AfterSuite sucess...");
	}
}
