package WorkinhWithunitTestingTools;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram {
	@Test
	public void run() {
	//	System.out.println("Hi test NG");
		
		Reporter.log("Hello Test NG",true);
	}

}
