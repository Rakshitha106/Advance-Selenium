package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Toyota {
	@Test(groups = "Car")
	public void toyota() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toyotabharat.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
