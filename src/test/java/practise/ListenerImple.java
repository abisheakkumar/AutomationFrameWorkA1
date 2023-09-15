package practise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(generic_utility.Listeners.class)
public class ListenerImple {
	@Test
	public void demo()
	{
		System.out.println("hi");
	}
}
