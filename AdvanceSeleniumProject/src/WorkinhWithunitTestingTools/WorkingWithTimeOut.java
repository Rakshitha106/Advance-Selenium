package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithTimeOut {

	@Test(timeOut = 3000)
	public void bookMyShow() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
	//	Thread.sleep(1000);
		driver.quit();
	}

}
