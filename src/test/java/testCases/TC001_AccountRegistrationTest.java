package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {


@Test
public void verify_accountregistration(){
	
	HomePage hp = new HomePage(driver);
	hp.Clickregistration();
     
	AccountRegistration ap = new AccountRegistration(driver);
	ap.setUsername(randomstring().toUpperCase());
	String password = randomnumber();
	ap.setpassword(password);
	ap.setconfirmpassword(password);
	ap.setemail(randomstring()+"@gmail.com");
	ap.setfullname(randomstring().toUpperCase());
	ap.captcha(randomstring().toUpperCase());
	ap.checkbox();
	ap.clickregistration();
     	
}
public String randomstring() {
	String generatedstring = RandomStringUtils.randomAlphabetic(8);
	return generatedstring;
}
public String randomnumber() {
	String generatenumber = RandomStringUtils.randomNumeric(4);
	String generatedstring = RandomStringUtils.randomAlphabetic(8);
	return (generatedstring+generatenumber);
}

}

