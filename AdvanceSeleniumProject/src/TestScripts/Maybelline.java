package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maybelline {
	
	@Test(groups = "cosmetic")
	public void maybelline() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}


}
