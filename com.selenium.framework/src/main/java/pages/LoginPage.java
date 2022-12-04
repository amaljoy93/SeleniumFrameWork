package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id="ap_email")
	WebElement uname;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signBtn;
	

	
	public LoginPage() {
		//this.driver = driver;
        PageFactory.initElements(driver, this);
    	
	}
	public HomePage login(String user,String paswd)
	{
		uname.sendKeys(user);
		continueBtn.click();
		pwd.sendKeys(paswd);
		signBtn.click();
		return new HomePage();
		
	}
}
