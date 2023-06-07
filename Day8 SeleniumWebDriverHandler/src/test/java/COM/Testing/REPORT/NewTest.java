package COM.Testing.REPORT;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver dr;
	  @Test
	  public void facebook() throws InterruptedException {
		  dr.findElement(By.name("email")).sendKeys("priya@gmail.com");
		  dr.findElement(By.name("pass")).sendKeys("priya");
		  dr.findElement(By.name("login")).click();
		  Thread.sleep(5000);
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
			//website link for the web browser
			dr.get("https://www.facebook.com/");
			
			//maximize the page of the browser
			dr.manage().window().maximize();
	  }

  @AfterTest
  public void afterTest() {
  
  dr.quit();
  }
}
