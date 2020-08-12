package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParameters 
{
	@Parameters("email")
	@Test
	public void Login(String email)
	{
		System.out.println("Enter your Email Address");
		System.out.println(email);
	}
}
