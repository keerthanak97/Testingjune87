package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/alert.html");
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();  //->to switch from driver to alertpage
		
		
		Alert a=driver.switchTo().alert();  //creating interface
		String actualtext = a.getText();
		if(actualtext.equals("Hello I am an alert box"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		
		
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
		
	}

}
