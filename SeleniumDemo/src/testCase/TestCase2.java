/**
 * auth by libn
 */
package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BaiduIndexPage1;
import pageObject.InitPage;

public class TestCase2 {
	public InitPage initPage;
	public BaiduIndexPage1 baidu;
	
	@Test
	public void baidu_test()throws Exception{
		baidu.click_Search_Button();
		Thread.sleep(1000);
		baidu.input_Search_Box("测试方案");
		Thread.sleep(1000);
		baidu.click_Search_Button();
		Thread.sleep(10000);
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
		//初始化百度页面
		initPage = new InitPage("http://www.baidu.com");
		baidu = initPage.get_BaiduIndexPage1();
		System.out.println("BeforeSuite sucess...");
	}
	@AfterSuite
	public void afterSuite(){
        initPage.teardownBrowser();
		System.out.println("AfterSuite sucess...");
	}
}
