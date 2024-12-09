package Generic;

import org.testng.annotations.Test;

public class Testcase4 extends Generic_main_class
{
	@Test(priority = 4)
	public void sou()
	{
		String page = driver.getPageSource();
		System.err.println(page);
		
		
	}

}
