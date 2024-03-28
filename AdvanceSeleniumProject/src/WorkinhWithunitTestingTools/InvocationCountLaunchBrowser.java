package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountLaunchBrowser{
	@Test(invocationCount = 5, threadPoolSize = 3)
	public void launch() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
