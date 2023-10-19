package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitnetflix {
	ChromeDriver driver;
	@Before
	public void openapp() {
		driver= new ChromeDriver();
		driver.get("https://www.netflix.com");
	}
	@Test
	public void titleverification() {
		String src= driver.getTitle();
		String expctd="Netflix";
		if(src.equals(expctd))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void contentverification() {
		String cnt=driver.getPageSource();
		if(cnt.contains("home"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void browserclose() {
		driver.close();
	}

}
