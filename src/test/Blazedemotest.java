package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemoregister;

public class Blazedemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void passvalues()
	{
		Blazedemoregister ob = new Blazedemoregister(driver);
		
		ob.setvalues("abc","multinational", "abc@gamil.com", "abc@123", "abc@123");
		ob.register();
		
		
	}
	

}
