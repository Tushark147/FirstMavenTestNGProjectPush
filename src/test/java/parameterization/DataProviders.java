package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider="dp1")
	public void testData(String username, String password)
	{
		
	}
	
	@DataProvider(name="dp1")
	public static Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="Abc";
		data[0][1]="Abc123";
		data[1][0]="Def";
		data[1][1]="Def123";
		return data;
	}
}
