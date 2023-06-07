package Day7.Day7_TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Day7_Task3 {

public WebDriver dr;
  @Test
  public void f() {
	  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		 // Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		 // Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  dr= new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		 * String title="Guest Registration Form"; String ctitle=dr.getTitle();
		 * Assert.assertEquals(title, ctitle);
		 */
  }

  @AfterTest
  public void afterTest() {
	  dr.quit();
  }

}
