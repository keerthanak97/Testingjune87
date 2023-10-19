package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juntnamelocater {
ChromeDriver driver;

	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
		@Test
		public void login()
		{
			driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
			//driver.findElement(By.name("btnK")).click();   if this is not working then enter only the above one
			
		}
		
	
		
		
	
}

