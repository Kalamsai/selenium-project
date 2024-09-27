package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
    public LoginPage(WebDriver driver) 
    {
    	super(driver);
    }
 @FindBy(xpath="//input[@id='username']") WebElement username;
 @FindBy(xpath="//input[@id='password']") WebElement password;
 @FindBy(xpath="//input[@id='login']") WebElement button_login;
 
 public void setusername(String enterusername) {
	 username.sendKeys(enterusername);
 }
 public void setpassword(String enterpassword) {
	 password.sendKeys(enterpassword);
 }
 public void clickloginbtn() {
	 button_login.click();
 }



}
