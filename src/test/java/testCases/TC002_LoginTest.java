package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Searchhotel;

public class TC002_LoginTest extends BaseClass{
   
@Test
public void verify_login() {
	LoginPage lp=new LoginPage(driver);
	lp.setusername(p.getProperty("username"));
	lp.setpassword(p.getProperty("password"));
	lp.clickloginbtn();
	
	//search hotel page
	Searchhotel sh= new Searchhotel(driver);
	sh.searchhotelpage();
			
}
	

}
