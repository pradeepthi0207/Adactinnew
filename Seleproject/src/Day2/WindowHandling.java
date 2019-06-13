package Day2;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandling extends BClass{
	
	public static void main(String[] args) throws Exception {
		
		getBrowser("Chrome");
		geturl("https://www.toolsqa.com/automation-practice-switch-windows/");
		String pid=driver.getWindowHandle();
		System.out.println("parent window"+pid);
		elementClick(driver.findElement(By.xpath("//button[@id='button1']")));
		elementClick(driver.findElement(By.xpath("//button[@id='button1']")));
		
		Set<String> cid = driver.getWindowHandles();
		for(String x:cid) {
			if(!pid.contentEquals(x)) {
			System.out.println("child window"+x);
		driver.switchTo().window(x);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.switchTo().defaultContent();
			}
			}
		Thread.sleep(1000);
        driver.quit();
	}
	
	

}
