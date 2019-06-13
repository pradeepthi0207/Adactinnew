package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@class='login']")
	private WebElement 	signin;
	                     
	@FindBy(id="email")
	private WebElement 	email;
	
	@FindBy(id="passwd")
	private WebElement 	password;
	
	@FindBy(id="SubmitLogin")
	private WebElement 	submitlogin;
	
	@FindBy(xpath="//li[text()='Invalid email address.']")
     private WebElement invalidemail;
	
	public WebElement getInvalidemail() {
		return invalidemail;
	}



	public WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitlogin() {
		return submitlogin;
	}
			
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
