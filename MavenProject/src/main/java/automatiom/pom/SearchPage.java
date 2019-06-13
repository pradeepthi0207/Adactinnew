package automatiom.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;
	
	@FindBy(id="search_query_top")
	private WebElement searchname;
	
	
	public WebElement getSearchname() {
		return searchname;
	}


	public WebElement getSearchbtn() {
		return searchbtn;
	}


	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchbtn;
	
public SearchPage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
}
