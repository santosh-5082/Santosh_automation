package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_for_TestNG 
{
	@Test(invocationCount = 1)
	public void Testcase1()
	{
		Reporter.log("Hiiii");
	}
	@Test(invocationCount = 2)
	public void Testcase2()
	{
	   Reporter.log("bye");	
	}
	
	
	

}
