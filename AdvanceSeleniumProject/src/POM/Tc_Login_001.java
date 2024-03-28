package POM;

import org.testng.annotations.Test;

public class Tc_Login_001 extends Base_Class{
	@Test
	public void loginPage() {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys("rakshitha.hn1992@gmail.com");
		lp.getPasswordTextField().sendKeys("Sanay@123");
		lp.getLoginButton().click();
		
		
	}

}
