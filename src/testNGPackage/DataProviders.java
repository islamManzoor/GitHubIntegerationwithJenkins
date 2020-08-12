package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders 
{

	@Test(dataProvider = "data")
	public void dataProvider(String Firstname, String LastName, String Email, String PhoneNumber)
	{
		System.out.println("First Name is:" +Firstname);
		System.out.println("Last Name is:" +LastName);
		System.out.println("Email is:" +Email);
		System.out.println("Phone Number is:" +PhoneNumber);
	}
	
	@DataProvider(name = "data")
	public Object[][] testData()
	{
		Object[][] obj = new Object[3][4];
		
		obj[0][0] = "Islam";
		obj[0][1] = "Manzoor";
		obj[0][2] = "islam4885@hotmail.com";
		obj[0][3] = "0345-4057636";
		
		obj[1][0] = "Aslam";
		obj[1][1] = "Manzoor";
		obj[1][2] = "aslam@hotmail.com";
		obj[1][3] = "0321-4057636";
		
		obj[2][0] = "Hashir";
		obj[2][1] = "Islam";
		obj[2][2] = "hashir@hotmail.com";
		obj[2][3] = "0333-4560274";
		
		return obj;
	}
}
