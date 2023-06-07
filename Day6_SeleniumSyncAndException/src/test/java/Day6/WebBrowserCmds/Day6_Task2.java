package Day6.WebBrowserCmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver dr=new ChromeDriver();
			dr.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
			dr.manage().window().maximize();
			WebElement firstname=dr.findElement(By.xpath("//*[@id=\'first_name\']"));
			firstname.sendKeys("Student");
			dr.findElement(By.xpath("//*[@id=\'last_name\']")).sendKeys("lastname");
			WebElement email=dr.findElement(By.xpath("//*[@id=\'user_email\']"));
			email.sendKeys("Student@gmail.com");
			Boolean fn=firstname.isDisplayed();
			Boolean em=email.isDisplayed();
			if(fn&&em)
			{
				System.out.println("The first name and user email text box is displayed");
			}
			else
			{
				System.out.println("The first name and user email text box is not displayed");

			}
			
			dr.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
			
			dr.findElement(By.xpath("//*[@id=\'user_pass\']")).sendKeys("Student12345");
			
			dr.findElement(By.xpath("//*[@id=\'input_box_1665629217\']")).sendKeys("onjobsxw");
			
			dr.findElement(By.xpath("//*[@id='date_box_1665628538_field']/span/input[1]")).click();
			
			dr.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[8]")).click();
			
			dr.findElement(By.name("phone_1665627880")).sendKeys("9476293000");
			
			dr.findElement(By.name("phone_1665627865")).sendKeys("9476293008");
			
			dr.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).click();
			
			dr.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[13]")).click();
			
			Select dob=new Select(dr.findElement(By.xpath("//*[@id=\'country_1665629257\']")));
			
			dob.selectByVisibleText("India");
			
			dr.findElement(By.xpath("//*[@id=\'number_box_1665629930\']")).sendKeys("8");
			
			dr.findElement(By.xpath("//*[@id=\'input_box_1665630010\']")).sendKeys("Room No:111Bed No:3");
			
			dr.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Somewhere Someplace Somework");
			
			dr.findElement(By.xpath("//*[@id=\'radio_1665627931_Yes\']")).click();
			
			dr.findElement(By.xpath("//*[@id=\'radio_1665627997_Single Room\']")).click();
			
			dr.findElement(By.xpath("//*[@id=\'radio_1665628131_Glutten Allergy\']")).click();
			
			Select act=new Select(dr.findElement(By.xpath("//*[@id=\'select_1665628361\']")));
			
			act.selectByVisibleText("Town Hall");
			
			dr.findElement(By.xpath("//*[@id=\'privacy_policy_1665633140\']")).click();
			
			//dr.findElement(By.cssSelector("#user-registration-form-771 > form > div.ur-button-container > button")).click();

	}

}
