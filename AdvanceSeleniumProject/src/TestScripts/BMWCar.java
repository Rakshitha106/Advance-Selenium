package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMWCar {
	@Test(groups = "Car")
	public void bmwcar() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in/en/index.html");
		Thread.sleep(2000);
		driver.quit();
		
	}


}
