package Testing.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3_1 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		
		//maximize the page of the browser
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		
		//Find the element in the website
		dr.findElement(By.id("input-firstname")).sendKeys("Hariharan");
		dr.findElement(By.id("input-lastname")).sendKeys("M");
		dr.findElement(By.id("input-email")).sendKeys("hari@gmail.com");
		dr.findElement(By.id("input-password")).sendKeys("password");
		dr.findElement(By.id("input-newsletter-yes")).click();	
		
		Thread.sleep(5000);
		dr.quit();
	}
}

