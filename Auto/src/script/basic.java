package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOriginGeneral")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[8]")).click();
		driver.findElement(By.xpath("//a[.='30']")).click();
		driver.findElement(By.id("btnBusSearchNewGeneral")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='XB28309584']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='L4'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='L3'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='L2'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='L1'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[33]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BOTE8D76FDA5B00ECBA80D5999552CBD293")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='3'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='2'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='1'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='4'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[33]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("SANTOSH");
		driver.findElement(By.xpath("(//input[@type='tel'])[7]")).sendKeys("8123205082");
		driver.findElement(By.xpath("(//input[@autocomplete='any'])[4]")).sendKeys("santu@gmail.com");
		WebElement ele = driver.findElement(By.xpath("//select[@class='payment_ddChild1 form-control pay-form-control']"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		
		
		System.out.println("ALL OK NAA KEEP GOING");
		Thread.sleep(8000);
		driver.quit();
		
	}

}
