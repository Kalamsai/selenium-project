package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchhotel extends BasePage {
WebDriver driver;
	
    public Searchhotel(WebDriver driver) 
    {
    	super(driver);
    }
@FindBy(xpath="//td[@class='login_title']") WebElement searchhotel;

public void searchhotelpage() {
	System.out.println(searchhotel.isDisplayed());
}

}
