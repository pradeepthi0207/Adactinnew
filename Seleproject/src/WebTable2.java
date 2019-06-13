import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Day2.BClass;

public class WebTable2   extends BClass{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=getBrowser("chrome");
		geturl("https://www.toolsqa.com/automation-practice-table/");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for(WebElement rows:trows) {
			
		List<WebElement> thead = driver.findElements(By.tagName("th"));
		for (int j=0;j<thead.size();j++) {
		String text=thead.get(j).getText();
		
		if(text.contentEquals("Burj Khalifa	")) {
		
			List<WebElement> tdata = driver.findElements(By.tagName("td"));
		
			for(int i=0;i<tdata.size();i++) {
				String text2=tdata.get(i).getText();
				System.out.println(text2);}
			}
		}
}}}