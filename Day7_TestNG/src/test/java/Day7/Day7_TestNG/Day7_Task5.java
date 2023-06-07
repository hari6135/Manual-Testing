package Day7.Day7_TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Day7_Task5 {
	WebDriver dr;
  @Test(groups= {"SmokeTest"})
  
  public void Test_Case_01() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  dr = new ChromeDriver();
	  
	  dr.get("https://www.godaddy.com/en-in");
	  dr.manage().window().maximize();
	  Thread.sleep(3000);
	  String title=dr.getTitle();
	  String ctitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(title, ctitle);
	  Thread.sleep(3000);
	  String url = "https://www.godaddy.com/en-in";
	  String curl = dr.getCurrentUrl();
	  Assert.assertEquals(url, curl);	  
  }
  @Test(groups= {"Regression TestCase"})
  public void TestCase_02() throws InterruptedException
  {
	  
	  
	  dr.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	  try
	  {
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
		  Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
		  Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("page Time out");
	  }
  }

  @Test(groups= {"Regression TestCase"})
  public void TestCase_03() throws InterruptedException {
	  dr.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	  try
	  {
		  
		  dr.get("https://www.godaddy.com/en-in/domains");
		String title1= dr.getTitle();
		System.out.println(title1);
		String ctitle1= "GoDaddy Domain Search - Buy and Register Available Domain Names";
		if(title1.equalsIgnoreCase(ctitle1))
		{
			
			dr.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
			
			dr.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).isDisplayed();
			  Thread.sleep(3000);
			dr.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
			dr.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
			  Thread.sleep(2000);
			dr.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
			  Thread.sleep(3000);
			dr.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span")).isDisplayed();
			
		}
		else
		{
			dr.getCurrentUrl();
		}
		  
		  
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("Page time out");
	  }
  }
}