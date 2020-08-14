package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 extends BaseTest {

	/*@BeforeTest
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
	}*/
	@Test(groups="smoke")
	public void validateTitles()
	{
		String expected="yahoo.com";
		String actual="gmail.com";
		
		SoftAssert softA= new SoftAssert();
		
		System.out.println("Validating Titles");
	//	Assert.assertEquals(actual , actual);
		softA.assertEquals(expected , actual);
		System.out.println("Validating Event Values");
	//	Assert.assertTrue(true, "Element not found");
		softA.assertTrue(true, "Element not found");
		
	//	Assert.fail();
		softA.assertAll();
	}
	
	/*@Test(priority=2)
	void doLogin()
	{
		System.out.println("Executing Login Test");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Closing Browser Test");
	}*/
}
