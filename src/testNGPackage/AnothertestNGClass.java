package testNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnothertestNGClass 
{
    @BeforeSuite
    public void suitBefore()
	{
		System.out.println("Test Before suit");
	}
    
    @AfterSuite
    public void suitAfter()
	{
		System.out.println("Test After suit");
	}
	
	@BeforeTest
	public void testBefore()
	{
		System.out.println("Test Before all tests");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Another Class");
	}
	
	@AfterTest
	public void testEnd()
	{
		System.out.println("Test after all tests");
	}
}

