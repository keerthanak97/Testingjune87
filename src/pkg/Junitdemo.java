package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void titleverification() {
		String src=driver.getTitle();
		System.out.println(src);
	}
	@Test
	public void contentverification() {
		String psrc=driver.getPageSource();
		if(psrc.contains("Gmail")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void browserclose() {
		driver.close();
	}

}
