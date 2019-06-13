package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='rooms_0']")
	private WebElement noOfrooms;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getRadiobtn() {
		return radiobtn;
	}



	public WebElement getContinuebtn() {
		return continuebtn;
	}



	public WebElement getNoOfrooms() {
		return noOfrooms;
	}
	
	

	public SelectHotelPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
