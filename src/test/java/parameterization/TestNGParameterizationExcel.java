package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {

	public static ExcelReader excel=null;
	@Test(dataProvider="getData")
	public void dotest(String username, String password, String is_correct)
	{
		//System.out.println("Checking the Datafrom Excel File: ");
		System.out.println(username+ "----"+ password+ "----"+ is_correct);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		if(excel == null)
		{
			excel = new ExcelReader("C:\\Users\\Tushar\\Desktop\\TestNGExcel.xlsx");
		}
		
		String sheetName="LoginTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++)
		{
			for(int colNum=0; colNum<cols; colNum++)
			{
				data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
				
			}
		}
		
		
		return data;
		
	}
}
