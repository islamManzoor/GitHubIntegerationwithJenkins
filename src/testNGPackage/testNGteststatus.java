package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGteststatus 
{
	@Test
	public void Login()
	{
		System.out.println("Login Successfuly");
		Assert.assertEquals("uktest", "pincode");
	}
	
	@Test(dependsOnMethods={"Login"})
	public void Quote()
	{
		System.out.println("Quote Successfuly");
		//throw new SkipException("Qoute is taking more than 4 seconds");
	}
	
	@Test
	public void Logout()
	{
		System.out.println("Logout Successfuly");
	}
}
