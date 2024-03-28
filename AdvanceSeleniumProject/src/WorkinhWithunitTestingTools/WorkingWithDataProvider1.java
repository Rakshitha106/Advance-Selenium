package WorkinhWithunitTestingTools;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider1 {
	@DataProvider(name="testData")
	public String[][] getData(){
		String[][] data=new String[2][5];
		data[0][0]="Rakshitha";
		data[0][1]="HN";
		data[0][2]="rakskhitha.hn1992@gmail.com";
		data[0][3]="Sanay@123";
		data[0][4]="Sanay@123";
		
		data[1][0]="Ravikumar";
		data[1][1]="HN";
		data[1][2]="rakskhitha89@gmail.com";
		data[1][3]="San123";
		data[1][4]="San123";
	
		return data;
	}
	@Test(dataProvider = "testData")
	public void dataDemo(String[] regData) {
		System.out.println(regData[0]);
		System.out.println(regData[1]);
		System.out.println(regData[2]);
		System.out.println(regData[3]);
		System.out.println(regData[4]);
		
	}

}
