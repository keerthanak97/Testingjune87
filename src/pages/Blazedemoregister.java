package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemoregister {
	WebDriver driver;
	By rname=By.xpath("//*[@id=\"name\"]");
	By rcompany =By.name("company");
	By remailaddr=By.id("email");
	By rpassword =By.name("password");
	By rconfirmpass= By.id("password-confirm");
	By resgister = By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazedemoregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirm)
	{
		driver.findElement(rname).sendKeys(name);
		driver.findElement(rcompany).sendKeys(company);
		driver.findElement(remailaddr).sendKeys(email);
		driver.findElement(rpassword).sendKeys(password);
		driver.findElement(rconfirmpass).sendKeys(confirm);
	}
	public void register()
	{
		driver.findElement(resgister).click();
	}

}
