package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithCrossBrowserTesting {
	
	public WebDriver driver;
	@Parameters("browserName")
	@Test
	public void browser(String browserName) throws Throwable {
		if (browserName.equals("chrome")) {
			
			driver=new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			
			driver=new FirefoxDriver();
			
		}
		else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
