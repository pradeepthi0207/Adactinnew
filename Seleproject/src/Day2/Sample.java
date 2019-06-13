package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Sample extends BClass {
	public static WebDriver driver;
	
	public static void ChromeLaunch() throws Exception {
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\accounts\\eclipse-workspace\\Seleproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(1000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='IF1']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		*/
		driver.quit();
		
	}
	public static void main(String[] args) throws Exception {
		getBrowser("chrome");
		geturl("https://www.google.com");
		//ChromeLaunch();
	}

}
