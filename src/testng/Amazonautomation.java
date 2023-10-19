package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonautomation {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test1()
	{
		String homepage = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		
		Set<String>allwindowhandles = driver.getWindowHandles();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		
				for(String handle:allwindowhandles)
				{
					
					if(!handle.equalsIgnoreCase(homepage))
					{
						driver.switchTo().window(handle);
						driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
						driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
					
					}
					
				}
				String title ="Amazon.in:mobile phones";
				String original = driver.getTitle();
				if(title.equalsIgnoreCase(original))
				{
					System.out.println("pass" +title);
				}
				else
				{
					System.out.println("fail");
				}
	
	}
}
