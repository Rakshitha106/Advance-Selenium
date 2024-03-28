package WorkinhWithunitTestingTools;

import org.testng.annotations.Test;

public class WorkinhWithDependsOnMethod {

		@Test	
		public void register() {
				System.out.println("User can able to Register to application");
			}
		@Test(dependsOnMethods = "register")	
			public void login() {
				System.out.println("User can able to login to application");
			}
		@Test	
			public void searchForProduct() {
				System.out.println("User can able to Search For Product");
			}
		@Test	
			public void Cart() {
				System.out.println("User can able to Add to Cart");
			}
		@Test	
			public void payment() {
				System.out.println("User can able to do Payment");
			}
		
}
