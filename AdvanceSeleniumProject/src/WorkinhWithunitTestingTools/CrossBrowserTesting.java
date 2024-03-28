package WorkinhWithunitTestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
	
	public WebDriver driver;
	@Parameters({"browserName","url"})
	@Test
	
	public void browser(@Optional("chrome")String browserName,@Optional("https://www.facebook.com")String url) throws Throwable {
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
		driver.get(url);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
