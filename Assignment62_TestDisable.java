package tesngselenium;

import org.testng.annotations.Test;

public class Assignment62_TestDisable {
	@Test(priority=0, enabled=false)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA priority = -1");
	}
	@Test(priority=1)
	public void testcaseB()
	{
		System.out.println("testcaseB priority =1");
	}
}
