package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest {
	
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
	@Test(priority=1, groups="functional")
	public void doUserReg()
	{
		System.out.println("Executing User Reg Test");
		System.out.println("For Registeration");
	}
	
	@Test(priority=2)
	void doLogin()
	{
		System.out.println("Executing Login Test");
		System.out.println("For Signing in");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing Browser Test");
	}

}
