package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tc_Reg_002 extends Base_Class{
	@Test
	public void searchProduct() throws Throwable {
		BasePage bp=new BasePage(driver);
		
		bp.getSearchBoxTextField().sendKeys("Fiction");
		Thread.sleep(3000);
		bp.getSearchButton().click();
	}

}
