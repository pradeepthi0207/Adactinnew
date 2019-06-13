package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	public WebDriver driver;
	@FindBy(xpath="//span[text()='deepthi p']")
	private WebElement  name;
	
	public WebElement getName() {
		return name;
	}


	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement SignOut;
	
	
	public WebElement getSignOut() {
		return SignOut;
	}
	
	public UserPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

}
