package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage {
	WebDriver driver;
	By forgottenlink=By.xpath("//a[contains(text(),'Forgotten password?']");
	//By forgottenlink =By.xpath("//*[@id="u_0_2_yA"]/div[3]");
	By forgottenpasswordmobile =By.xpath("//*[@id=\"identify_email\"]");
	By forgottensearch =By.name("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
	}
	
	public Passworderrorpage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgottenpasswordmobile).sendKeys(mobilenumber);
	}
	public void clicksearch()
	{
		driver.findElement(forgottensearch).click();
	}
	
	
	

}
