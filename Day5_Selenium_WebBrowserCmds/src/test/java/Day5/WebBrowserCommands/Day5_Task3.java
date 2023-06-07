package Day5.WebBrowserCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
				WebDriverManager.chromedriver().setup();
				WebDriver dr=new ChromeDriver();

				dr.get("https://j2store.net/free/");
				dr.manage().window().maximize();
				dr.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
				List<WebElement> name=dr.findElements(By.className("product-title"));
				for(WebElement list:name)
				{
					System.out.print(list.getText()+",");
				}

			}
	}