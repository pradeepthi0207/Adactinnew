package com.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BaseClassM;

import automatiom.pom.AddcartPage;
import automatiom.pom.Login;
import automatiom.pom.Logout;
import automatiom.pom.PaymentPage;
import automatiom.pom.SearchPage;

public class JunitAutomation extends BaseClassM{
	
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() throws Exception
	{
	driver = getBrowser("chrome");
	geturl("http://automationpractice.com/index.php");
	}
	
	
	@Before
	public void before() throws Exception
	{
		Login lg=new Login(driver);
		elementClick(lg.getSignin());
		inputValuestoWebelement(lg.getEmail(), "deepthi@gmail.com");
		inputValuestoWebelement(lg.getPassword(), "deepthi123");
	     elementClick(lg.getSubmitlogin());
	}
	
	@Test
	public void test1() throws Exception
	{
		SearchPage sp=new SearchPage(driver);
		AddcartPage add=new AddcartPage(driver);
		PaymentPage pay=new PaymentPage(driver);
		inputValuestoWebelement(sp.getSearchname(), "t shirt");
		elementClick(sp.getSearchbtn());
		Thread.sleep(2000);
		elementClick(add.getImg());
		elementClick(add.getAddtocart());
		Thread.sleep(2000);
		elementClick(add.getProceed());
		Thread.sleep(2000);
		elementClick(pay.getProceedchk());
		elementClick(pay.getProcessaddress());
		elementClick(pay.getProceedcheckout());
		elementClick(pay.getProcesscarrier());
		elementClick(pay.getBankwire());
		elementClick(pay.getCheckbox());
		elementClick(pay.getFinish());
		Thread.sleep(2000);
		takeScreenShot("automation.png");
		
		
	}
	
	@After
	public void after() throws Exception
	{
		Logout lout=new Logout(driver);
		elementClick(lout.getLogout());
	}
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	
}
