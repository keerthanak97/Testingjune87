package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAbsent {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void amazonin() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
	}

}
