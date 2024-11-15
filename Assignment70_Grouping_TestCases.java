package tesngselenium;

import org.testng.annotations.Test;

public class Assignment70_Grouping_TestCases {
	@Test(groups= {"System"})
	public void TC1()
	{
		System.out.println("TC1-System");
	}
	@Test(groups= {"System", "Smoke"})
	public void TC2()
	{
		System.out.println("TC2-System, Smoke");
	}
	@Test(groups= {"Integration"})
	void TC3()
	{
		System.out.println("TC3-Integration");
	}
	@Test(groups= {"Smoke"})
	public void TC4()
	{
		System.out.println("TC4-Smoke");
	}
	@Test(groups= {"Group5"})
	public void TC5()
	{
		System.out.println("TC5-Group5");
	}
}
