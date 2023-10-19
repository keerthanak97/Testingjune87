package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualtitle="facebook";
		System.out.println(actualtitle);
		String expectedtitle ="facebook";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");		}

	}

}
