package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncontent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String amz=driver.getPageSource();
		if(amz.contains("Best Sellers"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
