package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ColorBar {
	@Test(groups = "cosmetic")
	public void colorBar() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://colorbarcosmetics.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}


}
