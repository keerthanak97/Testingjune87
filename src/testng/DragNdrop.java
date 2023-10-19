package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNdrop {
	WebDriver driver;
	@BeforeTest
	public void set() 
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		WebElement dragg = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		act.dragAndDrop(dragg, dropp);
		act.perform();
		
		String text=dropp.getText();
		if(text.equals("Dropped"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
	}
	
	

}
