package WorkinhWithunitTestingTools;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {
	@Test
	public void url() throws InterruptedException {
		String expURL="https://demowebshop.tricentis.com/";
		String expLoginURL="https://demowebshop.tricentis.com/login";
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("User is able to open empty Browser",true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the Browser",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open the DemoWebShop",true);
		
		Thread.sleep(3000);
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertEquals(actualURL, expURL);
		
		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		String actualLoginURL=driver.getCurrentUrl();
		System.out.println(actualLoginURL);
		
	
		Assert.assertEquals(actualLoginURL, expLoginURL);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
