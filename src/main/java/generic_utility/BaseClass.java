package generic_utility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

		@BeforeSuite(groups="regressionTesting")
		public void bsConfig()
		{
			System.out.println("=====DataBase connection Successful=====");
		
		}
		@AfterSuite(alwaysRun=true)
		public void asConfig()
		{
			System.out.println("====DataBase connections drop successfully=====");
		}
}
