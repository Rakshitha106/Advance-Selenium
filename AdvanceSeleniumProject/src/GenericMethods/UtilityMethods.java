package GenericMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author sys
 *
 */
public class UtilityMethods {
	/**
	 * 
	 * @param path
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readingTheDataFromPropFile(String path, String key) throws Throwable {
		
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty(key);
		return URL;
		
		
	}
	public String readingTheDataFromExcelSheet(String path, String sheetName,int rownum,int cellnum) throws Throwable {
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		String data = book.getSheet(sheetName).getRow(rownum).getCell(cellnum).toString();
		return data;
		
	}

}
