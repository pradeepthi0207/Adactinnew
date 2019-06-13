import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLaunch {
	public static void ChromeLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\accounts\\eclipse-workspace\\Selproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeLaunch();
		
	}

}
