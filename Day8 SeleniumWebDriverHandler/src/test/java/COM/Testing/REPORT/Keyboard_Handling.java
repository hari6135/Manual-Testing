package COM.Testing.REPORT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Handling {
  @Test
  public void Key_Actions() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  Actions actions = new Actions(driver);
	  driver.get("https://demoqa.com/text-box");
	  driver.manage().window().maximize();

	  
	  WebElement fullName = driver.findElement(By.id("userName"));
      fullName.sendKeys("Priya");
      
      //Enter the Email
      WebElement email=driver.findElement(By.id("userEmail"));
      email.sendKeys("priya@gmail.com");
      
      // Enter the Current Address
      WebElement currentAddress=driver.findElement(By.id("currentAddress"));
      currentAddress.sendKeys("22 R.p Nagar. coimbatore-641039");
      
      // Copy the Current Address
      actions.keyDown(Keys.CONTROL);
      actions.sendKeys("a");
      actions.keyUp(Keys.CONTROL);

      actions.build().perform();
      Thread.sleep(2000);
      
      //Press the TAB Key to Switch Focus to Permanent Address
      actions.sendKeys(Keys.TAB);
      actions.keyDown(Keys.CONTROL);
      actions.sendKeys("c");

      actions.keyUp(Keys.CONTROL);

      Thread.sleep(2000);
      actions.build().perform();
      actions.sendKeys(Keys.TAB);
      Thread.sleep(2000);
      actions.build().perform();
      WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
      actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
     Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
      
      
       driver.close();

	}
  
  
  }
  

