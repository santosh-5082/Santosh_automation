package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_for_task2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./st/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/?_rdr");
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("santosh");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("Unu@788");
		driver.navigate().refresh();
		name.sendKeys("sant");
		
		pas.sendKeys("Unu@788");
		driver.quit();
		
		
		
		
	}

}
