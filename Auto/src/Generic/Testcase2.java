package Generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase2 extends Generic_main_class
{
	@Test(priority = 2)
	public void dis()
	{
		boolean l = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		System.out.println(l);
		
		boolean jk = driver.findElement(By.xpath("//a[@href='/r.php']")).isDisplayed();
		
		System.out.println(jk);
		
	}

}
