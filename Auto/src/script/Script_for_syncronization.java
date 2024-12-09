package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_for_syncronization 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("santosh");
		//Thread.sleep(3000);
		
		
		
		WebDriverWait wb=new WebDriverWait(driver, 10);
		wb.until(ExpectedConditions.titleContains("DemoApps"));
		String title = driver.getTitle();
		System.out.println(title);
		
		wb.until(ExpectedConditions.urlContains("demoapps"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	
		driver.quit();
	}
	

}
