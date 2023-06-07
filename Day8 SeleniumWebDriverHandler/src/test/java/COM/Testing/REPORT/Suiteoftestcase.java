package COM.Testing.REPORT;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Suiteoftestcase {
	public WebDriver dr;
	  @Test
	  public void facebook() throws InterruptedException {
		  dr.findElement(By.name("username")).sendKeys("Admin");
		  dr.findElement(By.name("password")).sendKeys("admin123");
		  dr.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);
		  dr.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		  Thread.sleep(2000);
		  dr.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  Thread.sleep(2000);
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
			//website link for the web browser
			dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//maximize the page of the browser
			dr.manage().window().maximize();
			Thread.sleep(3000);
	  }

@AfterTest
public void afterTest() {

dr.quit();
}
}
