package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	@Test(dataProvider="getData")
	public void doLogin(String userName, String password)
	{
		System.out.println(userName+ "----"+ password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="Abc";
		data[0][1]="Abc123";
		data[1][0]="Def";
		data[1][1]="Def123";
		data[2][0]="Ghi";
		data[2][1]="Ghi123";
		return data;
		
	}
	
	
}
