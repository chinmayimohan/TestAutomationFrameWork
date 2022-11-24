package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DWS_TwiiterPage extends Utility_methods{

	public DWS_TwiiterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login_button;
	
	public void click_login()
	{
		Click_Element(login_button);
	}
	
	

}
