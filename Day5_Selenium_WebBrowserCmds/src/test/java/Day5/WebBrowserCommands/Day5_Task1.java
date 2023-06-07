package Day5.WebBrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();

		dr.get("https://j2store.net/free/");
		dr.manage().window().maximize();
		String title=dr.getTitle();
		if(title.equals("Home"))
		{
			System.out.println("Title are Same");
		}
		else
		{
			System.out.println("Title are different");
		}
		dr.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
		if(dr.getTitle().equals("Shop"))
		{
			System.out.println("Title are Same");
		}
		else
		{
			System.out.println("Title are different");
		}

	}

}
