package amazon.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouramazonIn extends Basemodule {
	
	@FindBy( id="nav-your-amazon")
	private WebElement youramazonIn;
	
	
	public YouramazonIn(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void  clickyouramazonin (){
		
		youramazonIn.click();
		
	}

}
