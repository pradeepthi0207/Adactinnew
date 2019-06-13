package automatiom.pom;

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
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement 	submitlogin;

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
