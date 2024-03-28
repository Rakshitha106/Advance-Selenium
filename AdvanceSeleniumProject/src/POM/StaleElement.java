package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElement extends Base_Class{
	@Test
	public void searchProd() throws Throwable {
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("simple computer");
		Thread.sleep(3000);
		search.submit();
		Thread.sleep(3000);
		driver.navigate().refresh();
		search.sendKeys("Books");
		Thread.sleep(3000);
	}

}
