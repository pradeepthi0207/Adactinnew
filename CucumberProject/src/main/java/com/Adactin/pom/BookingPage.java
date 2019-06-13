package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expirydate;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book_nowbtn;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirydate() {
		return expirydate;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_nowbtn() {
		return book_nowbtn;
	}
	public BookingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
}
