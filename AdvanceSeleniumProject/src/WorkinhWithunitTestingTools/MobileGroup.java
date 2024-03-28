package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MobileGroup {

	@Test(groups = "Mobile")
	public void Vivo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in");
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(groups = "Mobile")
	public void Oppo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/");
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(groups = "Mobile")
	public void Poco() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.poco.in/");
		Thread.sleep(1000);
		driver.quit();
	}
}
