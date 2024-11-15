package tesngselenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment46_Annotations_Class_Method_Test {
	@BeforeTest
	public void bTest()
	{
		System.out.println("bTest");
	}
	@BeforeClass
	public void bClass()
	{
		System.out.println("bClass");
	}
	
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
}
