package Day5.WebBrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
				WebDriverManager.chromedriver().setup();
				WebDriver dr=new ChromeDriver();

				dr.get("https://j2store.net/free/");
				dr.manage().window().maximize();
				dr.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
				dr.navigate().back();
				dr.navigate().forward();
				dr.navigate().refresh();
				Thread.sleep(3000);
				dr.quit();
			}
	}

