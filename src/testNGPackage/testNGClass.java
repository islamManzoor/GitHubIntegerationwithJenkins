package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGClass 
{
	@BeforeClass
	public void Beforestart()
	{
    	System.out.println("TestNG Beforeclass annotation");
	}
	
	@BeforeMethod
	public void Beforetest()
	{
    	System.out.println("TestNG BeforeMethod annotation");
	}
	
	@Test
	public void testA()
	{
    	System.out.println("TestNG test annotation");
	}
	
	@AfterMethod
	public void Aftertest()
	{
    	System.out.println("TestNG AfterMethod annotation");
	}
	
	@AfterClass
	public void ClassEnd()
	{
    	System.out.println("TestNG AfterClass annotation");
	}
	
}
