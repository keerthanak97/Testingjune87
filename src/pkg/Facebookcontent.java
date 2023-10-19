package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcontent {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		String cont=driver.getPageSource();
		if(cont.contains("Log in"))
		{
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}

}
