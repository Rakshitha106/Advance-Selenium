package WorkingWithTestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import zmq.socket.reqrep.Rep;

public class Base_Class {
	public WebDriver driver;
	String email="rakshitha.hn1992@gmail.com";
	String pwd="Sanay@123";
	String actualUrl="https://demowebshop.tricentis.com/";
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Am before Suite");
		Reporter.log("BeforeSuite: DataBase Connection start",true);
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Am after Suite");
		Reporter.log("AfterSuite: DataBase Connection stop",true);
	}
	@BeforeClass
	public void browserSetUp() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to open empty Browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open DemoWebSho",true);
		String url = driver.getCurrentUrl();
		
		if (url.equals(actualUrl)) {
			Reporter.log("User is able to open DemoWebShop HomePAge",true);
			
		} else {
			Reporter.log("USer is not able to open DemoWebShop", true);

		}
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void toQuitBroswer() {
		driver.quit();
		Reporter.log("User is able to close the DemoWebShop",true);
	}
	@BeforeMethod
	public void login() throws Throwable  {
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Reporter.log("User is able to login to DemoWebShop",true);
		Thread.sleep(6000);
	}
	@AfterMethod
	public void logOut() throws Throwable{
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		Reporter.log("User is able to LogOut Succesfully", true);
		Thread.sleep(6000);
	}

}
