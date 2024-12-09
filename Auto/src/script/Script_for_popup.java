package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_for_popup 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		
	}

}
