package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Framework_utility.Utility_methods;

public class DWS_WishlistPage extends Utility_methods{

	public DWS_WishlistPage(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"wishlist-content\"]")
	WebElement display;
	
	
	
	

}
