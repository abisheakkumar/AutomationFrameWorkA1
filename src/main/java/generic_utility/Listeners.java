package generic_utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * This method will provide ITESTLISTENER
 */
public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		//syso(methodName+"pass");
		System.out.println("===========PASS========");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
				//syso(methodName+"pass");
		System.out.println("===========PASS========");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
				//syso(methodName+"pass");
		System.out.println("===========PASS========");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("===========PASS========");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("===========PASS========");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("===========PASS========");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("===========SKIP========");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("===========FAIL========");
	}
	
}
