package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wT_TRY {
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\accounts\\eclipse-workspace\\Seleproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
/*		List<WebElement> all = driver.findElements(By.xpath("//table//tbody//tr//td"));
		int size = all.size();
		System.out.println(size);
		for (WebElement all1 : all) {
			String text = all1.getText();
			System.out.println(text);
			
		}}
	WebElement particular = driver.findElement(By.xpath("//table//tbody//tr["+rowcell+"]//td["+coulmncell+"]"));
	
	String text1 = particular.getText();
			System.out.println(text1);
	
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr[3]//td"));
		int rowsize = row.size();
		System.out.println(rowsize);
		for (WebElement rowonly : row) {
			String text = rowonly.getText();
			System.out.println(text);
			
		}
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		int size = column.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			String text = column.get(i).getText();
			System.out.println(text);
			
		}
		*/
		
	/*	List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		int colsize = column.size();
		//System.out.println(colsize);
	for(int i=0;i<colsize;i++) {
		String text = column.get(i).getText();
		//System.out.println(text);
		if(text.equals("City	"));
		List<WebElement> fullcolumn = driver.findElements(By.xpath("//table//tbody//tr//td[ "+(i+1)+"]"));
		for (WebElement webElement : fullcolumn) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
			
		}*/
		List<WebElement> tcoloumn = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		int tcoloumnsize = tcoloumn.size();
		//System.out.println(tcoloumnsize);
		for (int J =0 ; J <tcoloumnsize ; J++) {
			String text = tcoloumn.get(J).getText();
			//System.out.println(text);
			
			if(text.equals("Saudi Arabia")) {
				
				List<WebElement> tcoldata = driver.findElements(By.xpath("//table//tbody//tr["+(J+1)+"]//td"));
				for (WebElement tdata : tcoldata) {
					System.out.println(tdata.getText());
					
					
					
					
				}
			}}
	
		
			
	}

	

	
public static void main(String[] args) {
	chrome();
}

	}
