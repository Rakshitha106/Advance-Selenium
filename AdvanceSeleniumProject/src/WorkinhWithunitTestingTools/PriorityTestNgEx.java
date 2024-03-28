package WorkinhWithunitTestingTools;

import org.testng.annotations.Test;

public class PriorityTestNgEx {

	@Test(priority = 1)
	public void register() {
			System.out.println("User can able to Register to application");
		}
	@Test(priority = 2)
		public void login() {
			System.out.println("User can able to login to application");
		}
	@Test(priority = 3)
		public void searchForProduct() {
			System.out.println("User can able to Search For Product");
		}
	@Test(priority = 4)
		public void addToCart() {
			System.out.println("User can able to Add to Cart");
		}
	@Test(alwaysRun = true)
		public void payment() {
			System.out.println("User can able to do Payment");
		}
	@Test(enabled = false)
		public void closeTheApp() {
			System.out.println("User can able to Close the App");
		}
}
