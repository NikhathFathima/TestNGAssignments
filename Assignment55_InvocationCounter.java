package tesngselenium;

import org.testng.annotations.Test;

public class Assignment55_InvocationCounter {
	@Test(priority=0, invocationCount=10)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	
}
