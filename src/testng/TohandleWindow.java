package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TohandleWindow {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test1()
	{   //to get the id details of currently used window
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window handle"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		
		//to get the id details of multiple tabs that are opened
		Set<String>allwindowhandles =driver.getWindowHandles();
		for(String handle: allwindowhandles) 
		{
			System.out.println("handle");
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();  // to close the currently used window (here child window)
			}
			driver.switchTo().window(parentwindow);
		}
		WebDriver driver1 = driver.switchTo().newWindow(WindowType.TAB);
		
		//WebDriver driver1 = driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");
		driver1.close();
	
	}


}
