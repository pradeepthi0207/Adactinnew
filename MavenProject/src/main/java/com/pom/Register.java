package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	public WebDriver driver;

	@FindBy(id="createAccountSubmit")
	private WebElement createaccount;
	
	@FindBy(xpath="//input[@name='customerName']")
	private WebElement customername;
	
	@FindBy(id="ap_phone_number")
	private WebElement mobileno;

	@FindBy(id="ap_email")
	private WebElement email;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	public WebElement getGetTextbox() {
		return getTextbox;
	}

	@FindBy(xpath="//div[@id='auth-warning-message-box']")
	private WebElement getTextbox; 	
		
	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getCustomername() {
		return customername;
	}
	
	public Register(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
}
