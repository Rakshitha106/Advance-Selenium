package WorkinhWithunitTestingTools;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronilogicalOrder {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Am before Suite");
		System.out.println("BeforeSuite: DataBase Connection start");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Am after Suite");
		System.out.println("AfterSuite: DataBase Connection stop");
	}
	@Test
	public void run() {
		System.out.println("Run the test");
	}
	@Test
	public void test() {
		System.out.println("@test1");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before the test");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("After the test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@Test
	public void Execute() {
		System.out.println("Execute");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}
