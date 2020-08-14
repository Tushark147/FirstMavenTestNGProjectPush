package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest
	public void createDbConn()
	{
		System.out.println("Creating DataBase Test");
	}
	
	@AfterTest
	public void closeDbConn()
	{
		System.out.println("Closing DataBase Test");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching Browser Test");
	}
	@Test(priority=1)
	public void doUserReg()
	{
		System.out.println("Executing User Reg Test");
	}
	
	@Test(priority=2)
	void doLogin()
	{
		System.out.println("Executing Login Test");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing Browser Test");
	}

}
