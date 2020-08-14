package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3  extends BaseTest{

	@Test(priority=1, groups="{functional,smoke}")
	public void doUserReg()
	{
		System.out.println("Executing User Reg Test");
	//	Assert.fail();
	}
	
	@Test(priority=2, dependsOnMethods="doUserReg", groups="{functional,smoke}")
	void doLogin()
	{
		System.out.println("Executing Login Test");
	}
	
	@Test(priority=3, groups="bvt")
	void thirdTest()
	{
		System.out.println("Executing Third Test");
	}
	
	@Test(priority=4,dependsOnMethods="doUserReg", alwaysRun=true)
	void fourthTest()
	{
		System.out.println("Executing Fourth Test");
	}
}
