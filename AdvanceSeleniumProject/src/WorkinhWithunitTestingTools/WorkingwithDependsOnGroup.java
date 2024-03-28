package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingwithDependsOnGroup {
	
	@Test(groups = "cab")
	public void ola() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(groups = "cab")
	public void uber() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/in/en/");
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(groups = "cab")
	public void rapido() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapido.bike/");
		Thread.sleep(1000);
		driver.quit();
	}
}
