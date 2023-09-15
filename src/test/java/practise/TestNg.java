package practise;

import org.testng.annotations.Test;

public class TestNg {
	@Test(enabled=true,invocationCount=5)
	public void contacts()
	{
		System.out.println("create");
	
		
	}
	@Test(priority=-2,dependsOnMethods="contacts")
	public void reset()
	{
      System.out.println("hi");
      
		
	}
	@Test
	public void demo()
	{
		System.out.println("Hi my dear saraswathi");
	}
}
