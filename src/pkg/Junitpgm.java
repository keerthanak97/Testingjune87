package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	
	@Before
	public void setup() {
		System.out.println("browser open");
	}
	@Test
	public void test() {
		System.out.println("test activities");	
	}
	
	
	@After
	public void browserclose() {
		System.out.println("browser close");
		
	}

}
