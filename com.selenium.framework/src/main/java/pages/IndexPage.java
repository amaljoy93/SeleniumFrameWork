package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class IndexPage extends TestBase{
	//WebDriver driver;
	@FindBy(id="nav-logo-sprites")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement signInBtn;
	
	public IndexPage() {
		//this.driver = driver;
        PageFactory.initElements(driver, this);
    	
	}
	public LoginPage clickSignInBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("in clickSignInBtn");
		signInBtn.click();
		return new LoginPage();
	}
	public boolean validateLogo()
	{
		return logo.isDisplayed();
		
	}
	public String getPageTitle()
	{
		String actTitle=driver.getTitle();
		return actTitle;
	}
}
