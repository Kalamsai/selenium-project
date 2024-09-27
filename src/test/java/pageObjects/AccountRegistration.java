package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {
		
	WebDriver driver;
	
    public  AccountRegistration(WebDriver driver) 
    {
    	super(driver);
    }
    
@FindBy(xpath="//input[@id='username']") WebElement txt_username;
@FindBy(xpath="//input[@id='password']") WebElement txt_password;
@FindBy(xpath="//input[@id='re_password']")  WebElement txt_confirmpassword;
@FindBy(xpath="//input[@id='full_name']") WebElement txt_fullname;
@FindBy(xpath="//input[@id='email_add']")  WebElement txt_email;
@FindBy(xpath="//input[@id='captcha-form']") WebElement btn_captcha;
@FindBy(xpath="//input[@id='tnc_box']") WebElement checkbox;
@FindBy(xpath="//input[@id='Submit']") WebElement register;

public void setUsername(String username) {
	txt_username.sendKeys(username);
}

public void setpassword(String password) {
	txt_password.sendKeys(password);
}
public void setconfirmpassword(String confirmpassword) {
	txt_confirmpassword.sendKeys(confirmpassword);
}
	
public void setfullname(String fullname) {
	txt_fullname.sendKeys(fullname);
}
public void setemail(String email) {
 txt_email.sendKeys(email);
}
public void captcha(String captcha) {
	btn_captcha.sendKeys(captcha);
}
public void checkbox() {
 checkbox.click();
}
public void clickregistration() {
  register.click();
}
}


	
	
















    
    
    
    

