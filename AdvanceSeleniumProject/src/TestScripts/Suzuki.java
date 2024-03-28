package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Suzuki {
	@Test(groups = "Car")
	public void suzuki() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marutisuzuki.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
