package amazon.selenium.script;

import org.testng.annotations.Test;

import amazon.selenium.pom.ValidLogin;
import amazon.selenium.pom.YouramazonIn;

public class Verifyvalidlogin  extends Basetest
{
	
	@Test
	public void verifyvalidlogin() throws InterruptedException {
		
	
		YouramazonIn y1 = new YouramazonIn(driver);
		
		y1.clickyouramazonin();
	
		ValidLogin v1 = new ValidLogin(driver);
		v1.setmbl("9866406966");
		logger.info("mail r mbl");
		v1.next();
		logger.info("clicked");

		v1.setpwd("9866406966");
		logger.info("enterd password");
		
		v1.clicklogin();
		logger.info("loggedin");
	 
		
		
		
	}

}
