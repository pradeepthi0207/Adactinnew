package Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\accounts\\eclipse-workspace\\Seleproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		 List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
					
					
					for(int i=0;i<column.size();i++) {
						String column1 = column.get(i).getText();
						if(column1.equals("1"))
						{
						
						
		WebElement row = driver.findElement(By.xpath("//table//tbody//tr["+(i+1)+"]//td"));
		System.out.println(row.getText());
					
					
					}
					
				}
			 
			
	}
		}
				

		
	




