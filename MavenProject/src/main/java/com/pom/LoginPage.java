package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	@FindBy(xpath="//a[@id='a-autoid-0-announce']")
	private WebElement clicksign;
	

	@FindBy(xpath ="//input[@type='email']")
	private WebElement loginFeild;

	@FindBys({ @FindBy(xpath = "//input[@type='submit']"), @FindBy(xpath = "//input[@value='GO']") })
	private WebElement submitBtn;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;

	@CacheLookup
	@FindAll(
	{@FindBy(xpath="//input[@type='submit']"),
					@FindBy(xpath="//input[@value='GO']")
					})
	private WebElement submit;
	

	public WebElement getClicksign() {
		return clicksign;
	}

	public WebElement getLoginFeild() {
		return loginFeild;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	public WebElement getContinuebtn() {
		return continuebtn;
	}


	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
