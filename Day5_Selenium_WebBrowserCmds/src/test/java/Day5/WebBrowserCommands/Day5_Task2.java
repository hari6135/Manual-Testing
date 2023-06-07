package Day5.WebBrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				WebDriverManager.chromedriver().setup();
				WebDriver dr=new ChromeDriver();

				dr.get("https://j2store.net/free/");
				dr.manage().window().maximize();
				if(dr.getCurrentUrl().equals("https://j2store.net/free/"))
				{
					System.out.println("URL is same");
				}
				else
				{
					System.out.println("URL is different");
				}
				dr.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
				if(dr.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
				{
					System.out.println("URL is same");
				}
				else
				{
					System.out.println("URL is different");
				}
				
			}
}