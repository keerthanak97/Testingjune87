package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class AssertionTask {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;

		@BeforeTest
		public void beftest()
		{
			//reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
			reporter=new ExtentHtmlReporter("./Reporter/myreport1.html");
			reporter.config().setDocumentTitle("Automationreport");
			reporter.config().setReportName("functional test");
			reporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("hostname", "localhost");
			extent.setSystemInfo("os", "windows10");
			extent.setSystemInfo("testername", "abc");
			extent.setSystemInfo("Browser Name", "chrome");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		@BeforeMethod
		public void setup()
		{
			driver.get("https://www.saucedemo.com/");
		}
		@Test
		public void loginverification()throws IOException
		{
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			test=extent.createTest("loginverification");
			String act="https://www.saucedemo.com/inventory.html";
			String exp= driver.getCurrentUrl();
			Assert.assertEquals(act, exp);
			
			
			
			
		}
		
}
	
	