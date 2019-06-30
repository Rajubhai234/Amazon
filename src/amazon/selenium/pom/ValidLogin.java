package amazon.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin extends Basemodule {
	
	@FindBy(id="ap_email")
    private WebElement mbl;
	
    @FindBy(id="continue")
    private WebElement continew;
    
    @FindBy(id="ap_password")
    private WebElement pwd;
    
    @FindBy(id="signInSubmit")
    private WebElement login;

    
    public ValidLogin(WebDriver driver) {
    	
    	super(driver);
    	PageFactory.initElements(driver,this);
    }
    
    public void setmbl(String mb) {
    	
    	mbl.sendKeys(mb);
    }
    
    public void next() {
    	continew.click();
    }
    public void setpwd(String pw) {
    	
    	pwd.sendKeys(pw);
    }
    
    public void clicklogin() {
    	login.click();
    }
    
    
}
