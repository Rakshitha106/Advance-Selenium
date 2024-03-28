package GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExcelSheet {
	@Test
	public void toOpenDemoWebShop() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethods um = new UtilityMethods();
		String URL = um.readingTheDataFromPropFile("./testData/TestDataExcel.xlsx", "url");
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		
		
}
}
