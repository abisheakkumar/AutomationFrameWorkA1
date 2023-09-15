package generic_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * this class provides implementation for IRetryAnalyzer interface of TestNG
 * @author AbisheakKumar V
 */

public class RetryAnalyserImplementation implements IRetryAnalyzer{
	
	int count=0;
	int retryCount=2;
	
	public boolean retry(ITestResult result)
	{
		while(count<retryCount)
		{
			count++;
			return true;
		}
		return false;
	}
}
