package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LakMe {
	
	@Test(groups = "cosmetic")
	public void lakMe() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}


}
