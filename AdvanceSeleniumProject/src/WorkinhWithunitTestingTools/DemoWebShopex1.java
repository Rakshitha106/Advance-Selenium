package WorkinhWithunitTestingTools;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo.class)
public class DemoWebShopex1 {
	
	public static WebDriver driver;
	String eurl="https://demowebop.tricentis.com/";
	
	@Test
	public void login() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String url=driver.getCurrentUrl();
		assertEquals(eurl, url);
		driver.quit();
	}

}
