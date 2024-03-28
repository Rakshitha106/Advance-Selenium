package WorkingWithreadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		// Step1:create object file
		File file = new File("./testData/AdvanceSeleniumTestData.xlsx");
		//step 2: FIS
		FileInputStream fis = new FileInputStream(file);
		//step 3:create object for excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//step 4:get the sheet name
	//	String sheetName = workbook.getSheetName(0);//without sheetname u can go direct sheet
	//	System.out.println(sheetName);//
		
		//step5: get the sheet
	//	XSSFSheet sheet = workbook.getSheet(sheetName);
		
		String sheet=workbook.getSheetName(0);
		//step6: get the row and cell
		//String url = sheet.getRow(0).getCell(0).getStringCellValue();
		String url = workbook.getSheet(sheet).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(url);
		//String Url = sheet.getRow(1).getCell(0).getStringCellValue();
		String Url = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		System.out.println(Url);
		//String username = sheet.getRow(1).getCell(1).getStringCellValue();
		String username = workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		String Pwd = workbook.getSheet(sheet).getRow(1).getCell(2).getStringCellValue();
		System.out.println(Pwd);
		
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("[id=\"Email\"]")).sendKeys(username);
		driver.findElement(By.cssSelector("[id=\"Password\"]")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		

	}

}
