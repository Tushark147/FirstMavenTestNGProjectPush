package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends BaseTest{

	@Test
	void doLogin()
	{
		Assert.fail();
		System.out.println("Capture Screenshot !!");
	}
}
