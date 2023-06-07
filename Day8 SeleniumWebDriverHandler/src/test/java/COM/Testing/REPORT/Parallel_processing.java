package COM.Testing.REPORT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_processing {
	public WebDriver dr;

  @Test
  public void Chrome1() {
	  WebDriverManager.chromedriver().setup();
	  dr= new ChromeDriver();
//	  dr.manage().window().maximize();
	  dr.get("https://www.google.com/");

  }
  
  @Test
  public void Edge() {
	  WebDriverManager.edgedriver().setup();
	  dr= new EdgeDriver();
//	  dr.manage().window().maximize();
	  dr.get("https://www.facebook.com");
  }
}
