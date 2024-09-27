package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	 public WebDriver driver;	
	 public Properties p;

@BeforeClass
@Parameters({"os","browser"})

public void setup(String os , String browser) throws IOException {
	
	//Loading config.properties file
	FileInputStream file = new FileInputStream("./src/test//resources//config.properties");
	p=new Properties();
	p.load(file);
	switch(browser.toLowerCase())
	{
	case "chrome":driver=new ChromeDriver();break;
	case "edge":driver=new EdgeDriver();break;

	
	}
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();
	driver.get(p.getProperty("url")); //reading url from properties file
	driver.manage().window().maximize();

}
@AfterClass
public void teardown() {
	driver.quit();
}
}

