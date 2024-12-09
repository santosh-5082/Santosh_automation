package Generic;

import org.testng.annotations.Test;

public class Testcase3 extends Generic_main_class

{
	@Test(priority = 3)
	public void title()
	{
		
		String tit = driver.getTitle();
		System.out.println(tit);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
