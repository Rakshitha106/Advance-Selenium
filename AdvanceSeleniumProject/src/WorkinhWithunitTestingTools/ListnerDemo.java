package WorkinhWithunitTestingTools;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
		Reporter.log(result.getName()+"Test case Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"Test case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"Test Case fail");
	
              LocalDateTime  systemTime= LocalDateTime.now();
              System.out.println(systemTime);
              String screenShtName=systemTime.toString().replace(":", "-");
              
              TakesScreenshot tks= (TakesScreenshot) DemoWebShopex1.driver;
              File src=tks.getScreenshotAs(OutputType.FILE);
              File dst= new File("./errorshots/"+screenShtName+".png");
             try {
				Files.copy(src, dst);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              
              
	}

}
