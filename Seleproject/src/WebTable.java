import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Day2.BClass;

public class WebTable  extends BClass{
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=getBrowser("chrome");
		geturl("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for(WebElement rows:trows) {
			List<WebElement> tdata = driver.findElements(By.tagName("td"));
			for(int i=0;i<tdata.size();i++) {
				//if(tdata.get(i).getText().equals("Dubai")) {
					
				//}
				System.out.println(tdata.get(i).getText());
			}}
		}
		
		//String s=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		//System.out.println(s);
				}


