package WorkingWithreadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadMultipleDataFromDemoWebShop {
@DataProvider(name="registerdata")
	public  String[][] registerData() throws Throwable {
		File file=new File("./testData/AdvanceSeleniumTestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		int numOfRows = workbook.getSheet("regData").getPhysicalNumberOfRows();
		int numOfCells = workbook.getSheet("regData").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numOfRows);
		System.out.println(numOfCells);
		
		String[][] data=new String[numOfRows][numOfCells];
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfCells; j++) {
				data[i][j]=workbook.getSheet("regData").getRow(i).getCell(j).toString();
				
			}
			
		}
		return data;

	}
	@Test(dataProvider = "registerdata")
	public void registerUser(String[] dataReg) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		if (dataReg[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		if (dataReg[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys(dataReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataReg[5]);
		driver.findElement(By.id("register-button")).click();
		
	}

}
