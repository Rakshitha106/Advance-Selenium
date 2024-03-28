package POM;

import org.testng.annotations.Test;

public class StaleElementExcepusingPOM extends Base_Class{
	@Test
	public void searchProd() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getSearchBoxTextField().sendKeys("Simple comupter");
		Thread.sleep(3000);
		bp.getSearchButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		bp.getSearchBoxTextField().sendKeys("Books");
		Thread.sleep(3000);
		
	}

}
