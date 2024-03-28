package WorkingWithTestNgProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShopRegistration {
	@Test
	public void verify_that_user_can_able_to_register_DemoWebShop_page() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user can able to open demowebshop welcome page",true);
		
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		Reporter.log("user can able to click on register button",true);
		String regURL = driver.getCurrentUrl();
		System.out.println(regURL);
		
		//driver.findElement(By.xpath("//label[text()=\"Gender:\"]")).click();
		
		WebElement radio = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		radio.click();
		if(radio.isSelected()) {
			System.out.println("Radio Button is selected");
		}
		else {
			System.out.println("Radio Button is not selected");
		}
		
	//	driver.findElement(By.xpath("//label[text()=\"First name:\"]")).sendKeys("Rakshitha");
//		Reporter.log("user can able to fill the first name",true);
//		
//		driver.findElement(By.xpath("//label[text()=\"Last name:\"]")).sendKeys("HN");
//		Reporter.log("user can able to fill the last name",true);
	
	
	}
	
	
	

}
