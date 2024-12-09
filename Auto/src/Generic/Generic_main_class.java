
package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_main_class 
{
	
	WebDriver driver;
	@BeforeMethod
	public void Browsersetup()
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?_rdr");
	}
	@AfterMethod
	public void Closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	}

}
