package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		String actualtitle="Amazon";
		System.out.println("actualtitle");
		String expectedtitle="amazon";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
