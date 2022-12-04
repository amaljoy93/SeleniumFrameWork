
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(id="nav-cart-count-container")
	WebElement cartIcon;
	

	
	public HomePage() {
		//this.driver = driver;
        PageFactory.initElements(driver, this);
    	
	}
	public boolean validateCart()
	{
		return cartIcon.isDisplayed();
	}
}
