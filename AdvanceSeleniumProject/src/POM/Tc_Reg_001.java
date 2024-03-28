package POM;

import org.testng.annotations.Test;

public class Tc_Reg_001 extends Base_Class {
	
	@Test
	public void register() {
		RegisterPage rp=new RegisterPage(driver);
		
		rp.getRegisterLink().click();
		rp.getGenderFemaleButton().click();
		rp.getFirstNameTextBox().sendKeys("Rakshitha");
		rp.getLastNameTextBox().sendKeys("HN");
		rp.getEmailTextBox().sendKeys("rakshitha.hn1992@gmail.com");
		rp.getPasswordTextField().sendKeys("Sanay@123");
		rp.getConfirmPasswordTextField().sendKeys("Sanay@123");
		rp.getRegisterButton().click();
	}

}
