package WorkinhWithunitTestingTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssertEx1 {
	@Test
	public void url() throws InterruptedException {
		String expURL="https://www.bmw.in/en/index.html";
		String expLoginURL="https://www.bmw.in/en/all-models.html";
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("User is able to open empty Browser",true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the Browser",true);
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("User is able to open the BMW url",true);
		
		Thread.sleep(3000);
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertEquals(actualURL, expURL);
		
		driver.findElement(By.xpath("//span[text()=\"Models\"]")).click();
		String actualLoginURL=driver.getCurrentUrl();
		System.out.println(actualLoginURL);
		
	
		Assert.assertEquals(actualLoginURL, expLoginURL);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
