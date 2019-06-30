package amazon.selenium.pom;

import org.openqa.selenium.WebDriver;

public abstract class Basemodule {
	
	public WebDriver driver;
	
	public Basemodule(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	

}
