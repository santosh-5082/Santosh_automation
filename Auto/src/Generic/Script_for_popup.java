package Generic;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_for_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.xpath("//a[.=\"Open in new window\"]")).click();
		Set<String> all = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(all);
		int con = arr.size();
		for(int i=0;i<con;i++)
		{
			 String ye = arr.get(i);
			
			driver.switchTo().window(ye);
			
			Thread.sleep(2000);
			
			String title = driver.getTitle();
			System.out.println(title);
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Santosh_mi");
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("kehooo");
//			//input[@id="password"]
//			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jh6^8");
		}
	
		Thread.sleep(2000);
		driver.quit();
	}

}
