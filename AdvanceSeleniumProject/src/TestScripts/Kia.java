package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kia {
	
	@Test(groups = "Car")
	public void kiaCar() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kia.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}


}
