package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmaillogo {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void verification() {
	boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(b)
	{
		System.out.println("displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
		boolean c=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isSelected();
		if(c)
		{
			System.out.println("checked");
		}
		else
		{
			System.out.println("unchecked");
		}
		 boolean r= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(r)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}

	}
	

}
