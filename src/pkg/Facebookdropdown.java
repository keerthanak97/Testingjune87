package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	ChromeDriver driver;
	@Before
	public void set() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	}
	@Test
	public void test()
	{
		WebElement dayelement =driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("18");
		List<WebElement>li=day.getOptions();
		System.out.println(li.size());
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select M = new Select(month);
		M.selectByIndex(7);
		List<WebElement>li1=M.getOptions();
		System.out.println(li1.size());
		
		WebElement year= driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select Y = new Select(year);
		Y.selectByVisibleText("1997");
		List<WebElement>li2= Y.getOptions();
		System.out.println(li2.size());
	}

}
