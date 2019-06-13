package com.test;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.pom.HomePage;
import com.pom.LoginPage;

public class TestScript extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = getBrowser("chrome");
		HomePage hp = new HomePage(driver);
		geturl("https://www.amazon.in");
		inputValuestoWebelement(hp.getSearchFeild(), "mobile");
		elementClick(hp.getSignInbtn());
		
		LoginPage login=new LoginPage(driver);
		elementClick(login.getLoginFeild());
		inputValuestoWebelement(login.getLoginFeild(), "xyz.com");
		elementClick(login.getContinuebtn());
		

		
		
	}
}
