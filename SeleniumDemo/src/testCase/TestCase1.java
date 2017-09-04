/**
 * 
 */
/**
 * @author libin
 *
 */
package testCase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonObject.*;
import pageObject.*;

public class TestCase1{
	BaiduIndexPage page = new BaiduIndexPage();
	UseBrowser ub = new UseBrowser();
	 
	WebDriver driver;
	@Test
	public void test_baidu() throws Exception {
		System.out.println("test_baidu start...");
		page.click_Search_Bar(driver);
		Thread.sleep(10000);
		page.input_Search_Box(driver,"PageObject 模式");
		Thread.sleep(10000);
		page.click_Search_Button(driver);
		
	}
	@Test
	public void test_baidu1() throws Exception {
		System.out.println("test_baidu start...");
		page.click_Search_Bar(driver);
		Thread.sleep(10000);
		page.input_Search_Box(driver,"selenium");
		Thread.sleep(10000);
		page.click_Search_Button(driver);
		
	}
	@Test
	public void test_baidu2() throws Exception {
		System.out.println("test_baidu start...");
		page.click_Search_Bar(driver);
		Thread.sleep(10000);
		page.input_Search_Box(driver,"testng");
		Thread.sleep(10000);
		page.click_Search_Button(driver);
		
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
//		ub.setupChrome("http://www.baidu.com");
//		ub.setupFirefox("http://www.baidu.com");
		driver = ub.setupIE("http://www.baidu.com");
		System.out.println("BeforeSuite sucess...");
	}
	@AfterSuite
	public void afterSuite(){
		ub.teardownBrowser();
		System.out.println("AfterSuite sucess...");
	}
}