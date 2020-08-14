package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Tushar\\Desktop\\check_screenshot\\MapInterface.png\" target=\"_blank\">Screenshot Link</a>");
		//Reporter.log("Screenshot Link");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\Tushar\\Desktop\\check_screenshot\\MapInterface.png\" target=\"_blank\"><img height=200 width=200 src=\"C:\\Users\\Tushar\\Desktop\\check_screenshot\\MapInterface.png\" />Screenshot Link</a>");
		System.out.println("Capturing Screenshot for the failed Testcase: "+ result.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test: "+ result.getName());
		
	}

}
