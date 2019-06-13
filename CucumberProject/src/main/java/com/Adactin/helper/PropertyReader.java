package com.Adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertyReader {
	public static Properties prop;

	public PropertyReader() throws Throwable {
		try {
			prop = new Properties();
			File propFILE = new File(
					System.getProperty("user.dir") + "\\src\\test\\resource\\com\\Adactin\\resource\\config.properties");
			FileInputStream fin = new FileInputStream(propFILE);
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	

	public String getBrowserName() throws Exception {
		String property = prop.getProperty("Browser");
		if (property==null) {
			throw new Exception("not valid");
		}
		return property;

	}
	public String getUrl() throws Exception {
		String property = prop.getProperty("url");
		if (property==null) {
			throw new Exception("not valid");
		}
		return property;

	}
	public String getUsername() throws Exception {
		String property = prop.getProperty("username");
		if (property==null) {
			throw new Exception("Invalid Username");
		}
		return property;

	}
	public String getPassword() throws Exception {
		String property = prop.getProperty("password");
		if (property==null) {
			throw new Exception("Invalid Username");
		}
		return property;
		}
	public String getImplicitWait() throws Exception {
		String property = prop.getProperty("ImplicitWait");
		if (property==null) {
			throw new Exception("Invalid Wait Name");
		}
		return property;
		}
	
}
