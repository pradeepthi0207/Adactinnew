package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcartPage {
	public WebDriver driver;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement img;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	

public WebElement getImg() {
		return img;
	}



	public WebElement getAddtocart() {
		return addtocart;
	}



	public WebElement getProceed() {
		return proceed;
	}



public AddcartPage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
}
}