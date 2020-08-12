package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGGrouping 
{

	@Test(groups = {"Functional"})
	public void test1()
	{
		System.out.println("Functional Test");
		Assert.assertEquals("uktest", "pincode");
	}
	
	@Test(dependsOnMethods="test1", groups = {"Regression"})
	public void test2()
	{
		System.out.println("Regression Test");
	}
	
	@Test(groups = {"Performance"})
	public void test3()
	{
		System.out.println("Performance Test");
	}
	
}
