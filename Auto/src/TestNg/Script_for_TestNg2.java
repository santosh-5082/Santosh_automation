package TestNg;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Script_for_TestNg2 
{
	@Test(priority = 1)
	public void signup()
	{
		System.out.println("ok signup");
	}
	@Test(priority = 2,dependsOnMethods = "signup" ,invocationCount = 2)
	public void login()
	{
		System.out.println("ok login");
	}
	@Test(priority = 3,dependsOnMethods = "login")
	public void homepage()
	{
		System.out.println("ok homepage");
	}
	@Test(priority = 4,dependsOnMethods = "homepage")
	public void logout()
	{
		System.out.println("ok logout");
	}

}
