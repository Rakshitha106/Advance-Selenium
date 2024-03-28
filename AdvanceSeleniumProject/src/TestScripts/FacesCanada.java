package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacesCanada {

	@Test(groups = "cosmetic")
	public void facesCanada() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facescanada.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
