package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.fail;

import com.baseclass.BaseClass;

public class JunitTest extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception
	{
	driver = getBrowser("chrome");
	geturl("http://automationpractice.com/index.php");
	}

	@Before
	public void before() throws Exception {		
		elementClick(driver.findElement(By.xpath("//a[@class='login']")));	
		inputValuestoWebelement(driver.findElement(By.id("email")),"deepthi@gmail.com");
		inputValuestoWebelement(driver.findElement(By.id("passwd")),"deepthi123");
		elementClick(driver.findElement(By.xpath("//button[@id='SubmitLogin']")));
		
	}		

	@Test 
	public void test1() throws Exception {
		
		inputValuestoWebelement(driver.findElement(By.id("search_query_top")),"t shirt");
		elementClick(driver.findElement(By.xpath("//button[@name='submit_search']")));
		selectDDusingVisibleText(driver.findElement(By.id("selectProductSort")),"Price: Lowest first");
		elementClick(driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")));
		elementClick(driver.findElement(By.xpath("//span[text()='Add to cart']")));
		Thread.sleep(2000);

		elementClick(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//button[@name='processAddress']")));
		Thread.sleep(3000);

		elementClick(driver.findElement(By.xpath("//div[@id='uniform-cgv']")));
		Thread.sleep(2000);

		elementClick(driver.findElement(By.xpath("//button[@name='processCarrier']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//a[@class='bankwire']")));
		String s= driver.findElement(By.xpath("//div[@class='box cheque-box']")).getText();
		System.out.println(s);
		elementClick(driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")));
	
	}
	
	@Test @Ignore
	public void test2() throws Exception {
		
		mouseHovertoElement(driver.findElement(By.xpath("//a[@title='Women']")));
		Thread.sleep(3000);

		elementClick(driver.findElement(By.xpath("//a[@title='T-shirts']")));
		elementClick(driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//button[@class='exclusive']")));
		Thread.sleep(2000);

		elementClick(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//button[@name='processAddress']")));
		Thread.sleep(3000);

		elementClick(driver.findElement(By.xpath("//div[@id='uniform-cgv']")));
		Thread.sleep(2000);

		elementClick(driver.findElement(By.xpath("//button[@name='processCarrier']")));
		Thread.sleep(2000);
		elementClick(driver.findElement(By.xpath("//a[@class='bankwire']")));
		String s= driver.findElement(By.xpath("//div[@class='box cheque-box']")).getText();
		System.out.println(s);
		elementClick(driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")));
	
	}
	
	
	@After
	public void after1() throws Exception {
		elementClick(driver.findElement(By.xpath("//a[@title='Log me out']")));
	}
	
	@AfterClass
	public static void afterclass() throws Exception {
	driver.quit();
	}
	
}
