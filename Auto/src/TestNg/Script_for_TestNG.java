package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_for_TestNG 
{
	@Test(invocationCount = 1 , priority = 2)
	public void Test1()
	{
		Reporter.log("Hiiii");
	}
	@Test(invocationCount = 1, dependsOnMethods = "Test1" , priority = 1)
	public void Test2()
	{
	   Reporter.log("bye");	
	}

	@Test(invocationCount = 2 ,dependsOnMethods = "Test2" , priority = 3)
	public void Test3()
	{
		Reporter.log("OkByee");
	}
}
