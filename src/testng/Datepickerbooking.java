package testng;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerbooking {
	public class Datepicker {
		WebDriver driver;
		@BeforeTest
		public void set()
		{
			driver = new ChromeDriver();
			
		}
		@BeforeMethod
		public void urlrloading()
		{
			driver.get("https://www.booking.com/");
		}
		@Test
		public void testlogin()
		{
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/span[1]")).click();
			
			while(true)
			{
				WebElement month = driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
				String month1 = month.getText();
				if(month1.equals("October 2023"))
				{
					System.out.println(month1);
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span")).click();
				}
			}
			List<WebElement>alldates1=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span/span"));
			for(WebElement dateelement:alldates1)
			{
				String date = dateelement.getText();
				//System.out.println(date);
				if(date.equals("29"))
				{
					dateelement.click();
					break;
					
				}
				
			}
			//navigation commands
			//driver.navigate().forward();
			//driver.navigate().back();
			//driver.navigate().refresh();
			//driver.navigate().to("");
			
		}

	}

	
	
}
