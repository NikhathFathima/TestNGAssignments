package tesngselenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment44_Annotations {

	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	@BeforeTest
	public void bTest()
	{
		System.out.println("bTest");
	}
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	@AfterClass
	public void aClass()
	{
		System.out.println("aClass");
	}
	@BeforeClass
	public void bClass()
	{
		System.out.println("bClass");
	}
	@AfterTest
	public void aTest()
	{
		System.out.println("aTest");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("TestCase1");
	}
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("bSuite");
	}
	@AfterSuite
	public void aSuite()
	{
		System.out.println("aSuite");
	}
	
	
	
}
