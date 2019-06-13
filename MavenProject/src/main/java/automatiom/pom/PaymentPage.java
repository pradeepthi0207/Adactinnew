package automatiom.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

public WebDriver driver;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedchk;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement processaddress;
	
	@FindBy(xpath="//div[@id='uniform-cgv']")
	private WebElement proceedcheckout;

	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement processcarrier;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	
	@FindBy(xpath="//div[@class='box cheque-box']")
	private WebElement checkbox;
	
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement finish;


	
	public WebElement getProceedchk() {
		return proceedchk;
	}



	public WebElement getProcessaddress() {
		return processaddress;
	}



	public WebElement getProceedcheckout() {
		return proceedcheckout;
	}



	public WebElement getProcesscarrier() {
		return processcarrier;
	}



	public WebElement getBankwire() {
		return bankwire;
	}



	public WebElement getCheckbox() {
		return checkbox;
	}



	public WebElement getFinish() {
		return finish;
	}



	public PaymentPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);}
}
