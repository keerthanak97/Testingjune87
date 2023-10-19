package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred()throws Exception
	{
		Fbpage p1 = new Fbpage(driver);
		//Reading the data from excel file by the specified path
		
		String xl ="C://Users//HP//OneDrive//Desktop//WORKS//fcbook.xlsx/";
		String Sheet = "Sheet1";
		int rowCount = Excelutil.getRowCount(xl,Sheet);
		for (int i=1;i<=rowCount;i++)
		{
			String Username =Excelutil.getCellValue(xl,Sheet,i,0);
			System.out.println("username---"+Username);
			String Pwd =Excelutil.getCellValue(xl, Sheet, i, 1);
			System.out.println("password---"+Pwd);
			
			//passing username and password as parameters
			
			//submitting the data on clicking on login button
			
			p1.setvalues(Username, Pwd);
			p1.login();
		}
	}
	

}
