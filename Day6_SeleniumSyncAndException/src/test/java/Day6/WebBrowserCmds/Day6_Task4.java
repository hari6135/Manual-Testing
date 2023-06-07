package Day6.WebBrowserCmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_Task4 
{
	public static void main(String args[]) throws InterruptedException
	{
		  WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		dr.get(expected);
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.findElement(By.name("username")).sendKeys("Admin");
		dr.findElement(By.name("password")).sendKeys("admin123");
		dr.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String actual = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		Assert.assertEquals(actual, expected);


	}
}
