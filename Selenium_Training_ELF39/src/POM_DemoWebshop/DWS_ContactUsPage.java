package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_ContactUsPage {

	public DWS_ContactUsPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@id=\"FullName\"]")
	WebElement fullName_feild;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	WebElement email_feild;
	
	@FindBy(xpath="//textarea[@id=\"Enquiry\"]")
	WebElement textarea_feild;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	WebElement submit_button;
	
	public void sendTo_fullname_feild(String name)
	{
		fullName_feild.sendKeys(name);
	}
	public void sendTo_email_feild(String email)
	{
		email_feild.sendKeys(email);
	}
	public void sendTo_textArea_feild(String note)
	{
		textarea_feild.sendKeys(note);
	}
	public void click_submitButton()
	{
		submit_button.click();
	}
	

}
