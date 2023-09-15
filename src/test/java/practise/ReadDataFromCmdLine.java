package practise;

import org.testng.annotations.Test;

public class ReadDataFromCmdLine {
	@Test
	public void readDataFromCmdLine()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		
		//to compile in cmd line
		//mvn -Dbrowser=CHROME -Durl=https://www.facebook.com/ -Dtest=ReadDataFromCmdLine test
	}
}
