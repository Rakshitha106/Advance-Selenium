package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaymentGroup {

	@Test(groups = "Payment", dependsOnGroups = "Mobile")
	public void cred() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cred.club/");
		Thread.sleep(1000);
		driver.quit();
	}
}
