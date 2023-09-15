package practise;

import org.testng.annotations.Test;

public class RetryAnalyserPractise {

	@Test(retryAnalyzer = generic_utility.RetryAnalyserImplementation.class)
	public void sample()
	{
		//Assert.fail();
		System.out.println("hello");
	}
}
