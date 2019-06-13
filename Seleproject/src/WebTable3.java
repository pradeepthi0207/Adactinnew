import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Day2.BClass;

public class WebTable3 extends BClass{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=getBrowser("chrome");
		geturl("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for(WebElement rows:trows) {
				String s=driver.findElement(By.xpath("//table/tbody/tr["+rows+"]/td[2]")).getText();
		System.out.println(s);
				} 
}
}