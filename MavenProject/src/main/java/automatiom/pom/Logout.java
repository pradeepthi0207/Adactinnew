package automatiom.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
public WebDriver driver;

	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	} 
	
	public Logout(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}


	
}
