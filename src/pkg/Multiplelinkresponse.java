package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinkresponse {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void Linkcount()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links="+li.size());
		
		for(WebElement s:li)
		{
			String links =s.getAttribute("href");
			verify(links);
		}
		
	}
	
	public void verify(String links) {
		
		try 
		{
			URL ob = new URL(links);
			HttpURLConnection con = (HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid---"+links);
			}
			else if (con.getResponseCode()==404)
			{
				System.out.println("brokenlink---"+links);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
