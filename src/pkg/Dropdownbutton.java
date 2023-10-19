package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbutton {
	ChromeDriver driver;
	@Before
	public void set() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void passvalue() {
		//select by value
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		 Select day = new Select(dayelement);
		 day.selectByValue("04");
		 
		 //select by index
		 WebElement Month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		 Select M = new Select(Month);
		 M.selectByIndex(3);
		 
		 //select by visible text
		 WebElement Year= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		 Select Y =new Select(Year);
		 Y.selectByVisibleText("2011");
		 
		 
		 //to get the total count of drop down buttons
		 List<WebElement>li=day.getOptions();
		 System.out.println(li.size());
		 
		 List<WebElement>li1=M.getOptions();
		 System.out.println(li1.size());
		 
		 List<WebElement>li2=Y.getOptions();
		 System.out.println(li2.size());
		 
		 
	}

}
