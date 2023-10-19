package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juntidlocater {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
