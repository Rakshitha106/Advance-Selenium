package WorkingWithreadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		File file=new File("./testData/data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL=pro.getProperty("url");
		
		
		driver.get(URL);
		driver.quit();
		
		System.out.println(pro.get("url"));
		System.out.println(pro.get("usernamae"));
		System.out.println(pro.get("password"));
		System.out.println(pro.get("place"));
		System.out.println(pro.get("company"));
		

	}

}
