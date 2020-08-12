package testNGPackage;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerTest extends TestListenerAdapter
{
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test case Passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test case Failed");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test case Skipped");
	}
}
