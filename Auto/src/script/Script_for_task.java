package script;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Script_for_task 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[@href='https://www.nuget.org/packages/Selenium.WebDriver'])[1]"));
	     WebElement ele2 = driver.findElement(By.xpath("//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[@href='https://pypi.python.org/pypi/selenium']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[@href='https://npmjs.org/package/selenium-webdriver']"));
		 Set<String> okk = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(okk);
		arr.add("ele1");
		arr.add("ele2");
		arr.add("ele3");
		arr.add("ele4");
		int count = arr.size();
		for(int i=0;i<count;i++)
		{
			String sp = arr.get(i);
			
			Actions a=new Actions(driver);
			a.contextClick().perform();
			Robot r = new Robot();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
			}
	
		String yess = driver.getTitle();
		System.out.println(yess);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
