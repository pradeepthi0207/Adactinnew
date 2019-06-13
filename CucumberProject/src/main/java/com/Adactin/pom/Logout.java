package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
public static WebDriver driver;
	@FindBy(id="logout")
	private WebElement logout;

	@FindBy(xpath="//td[@class='reg_success']")
	private WebElement logouttext;
	
	public WebElement getLogouttext() {
		return logouttext;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	
}
