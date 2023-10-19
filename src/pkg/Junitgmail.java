package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitgmail {
	ChromeDriver driver;
	@Before
	public void openurl() {
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	@Test
	public void titleverification() {
		String src= driver.getTitle();
		String exp="Gmail";
		if(src.equals(exp))
		{
			System.out.println("pass");
			System.out.println(src);
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println("title verified");
	}
	@Test
	public void content() {
		String src=driver.getPageSource();
		if(src.contains("Sign in"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	@After
	public void closebrowser() {
		driver.close();
		System.out.println("close");
	}

}
