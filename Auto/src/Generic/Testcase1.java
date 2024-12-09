package Generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase1 extends Generic_main_class
{
	@Test(priority = 1)
	public void usn()
	{
		boolean y = driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		boolean k = driver.findElement(By.xpath("//input[@type='password']")).isEnabled();
		System.out.println(y);
		System.out.println(k);
		
		
	}

}
