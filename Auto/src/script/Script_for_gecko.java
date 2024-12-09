package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script_for_gecko 
{
	@Test
	public void gecko()
	{
		System.setProperty("webdriver.gecko.driver","./st/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtub.com");
		
	}

}
