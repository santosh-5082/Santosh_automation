package script;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scripr_for_Screenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","./st/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Date dat = new Date();
		String d1 = dat.toString().replaceAll(":","-");
		System.out.println(d1);
		TakesScreenshot screen=(TakesScreenshot)driver;
		File temp = screen.getScreenshotAs(OutputType.FILE);
		File perm = new File("D:\\ScreenshotsAuto/defect1.jpeg");
		FileHandler.copy(temp, perm);
	    Thread.sleep(2000);
	    driver.quit();
		
		
	}

}
