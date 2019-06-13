package com.Test;

import org.openqa.selenium.WebDriver;

import com.base.BaseClassM;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.Register;

public class TestScript extends BaseClassM {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = getBrowser("chrome");
		
		HomePage hp = new HomePage(driver);
		geturl("https://www.amazon.in");
		inputValuestoWebelement(hp.getSearchFeild(), "mobile");
		elementClick(hp.getSignInbtn());
		//elementClick(hp.getSelectmobile());
		
		LoginPage login=new LoginPage(driver);
		elementClick(login.getLoginFeild());
		inputValuestoWebelement(login.getLoginFeild(), "xyz.com");
		elementClick(login.getContinuebtn());
		
        Register reg=new Register(driver);
        elementClick(reg.getCreateaccount());
        inputValuestoWebelement(reg.getCustomername(), "deepthi");
        inputValuestoWebelement(reg.getMobileno(), "12345");
        inputValuestoWebelement(reg.getEmail(), "deepthi@gmail.com");
        inputValuestoWebelement(reg.getPassword(), "deepthi");
        elementClick(reg.getContinuebtn());
       
		
		driver.quit();
	}
}
