package WorkingWithTestNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends Base_Class {

	@Test
	public void Validate_that_user_is_able_to_click_on_wishlist_button() {
		driver.findElement(By.xpath("//a[text()=\"Wishlist\"]")).click();
		Reporter.log("USer is able to  click on whishlist",true);
	}
}
