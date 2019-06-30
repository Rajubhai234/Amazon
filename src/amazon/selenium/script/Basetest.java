package amazon.selenium.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest {
	
public WebDriver driver;
protected  Logger logger = LogManager.getLogger(Basetest.class); 

	@BeforeMethod
	public void precondition () 
	{
		String path="C://Users//somashekar//eclipse-workspace//Amazon//log4j2.properties";
		PropertyConfigurator.configure(path);
		driver= new FirefoxDriver();
		logger.info("browser lanched");
		driver.get("https://www.amazon.in/");
		logger.info("url entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postcondition() {
		
		driver.close();
		logger.info("browser.closed");
	}

}
