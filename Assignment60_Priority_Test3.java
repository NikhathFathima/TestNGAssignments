package tesngselenium;

import org.testng.annotations.Test;

public class Assignment60_Priority_Test3 {
	@Test(priority=0)
	public void testcaseC()
	{
		System.out.println("testcaseC");
	}
	@Test(priority=-1)
	public void testcaseA()
	{
		System.out.println("testcaseA");
	}
	@Test(priority=1)
	public void testcaseB()
	{
		System.out.println("testcaseB priority =1");
	}
	@Test(priority=1)
	public void testcaseD()
	{
		System.out.println("testcaseD priority =1");
	}
}
