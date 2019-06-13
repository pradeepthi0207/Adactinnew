package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingMultiple {
	public static void multiple() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String parent = driver.getWindowHandle();
		driver.findElement(
				By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/I/41EtmhOcCFL.__AC_SY200_.jpg']"))
				.click();
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
