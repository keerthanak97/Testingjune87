package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Googlesrcnshot {
 ChromeDriver driver;
 @Before
 public void set() {
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com");
 }
 @Test
 public void screenshot() throws Exception {
	/*File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("C:\\Users\\HP\\OneDrive\\Desktop\\error1.png"));*/
	 
	 WebElement gmailimg=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
	 File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src1, new File("./Screehshot/Elescrnshot.png"));
 }
}
