package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_RegisterPage {
	public DW_RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-female")
	WebElement genderRadio_button;
	
	@FindBy(name="FirstName")
	WebElement firstName_TextField;
	
	@FindBy(name="LastName")
	WebElement lastName_TextField;
	
	@FindBy(id="Email")
	WebElement email_textField;
	
	@FindBy(id="Password")
	WebElement password_Textfield;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword_textField;
	
	@FindBy(id="register-button")
	WebElement register_button;
	
	public void clk_radioButton() {
		genderRadio_button.click();
	}
	public void enter_FirstName(String value) {
		Utility_methods.Enter_Value_In_Edit_Field(firstName_TextField, value);
	}
	public void enter_LastName(String value) {
		Utility_methods.Enter_Value_In_Edit_Field(lastName_TextField, value);
	}
	public void enter_Email(String value) {
		Utility_methods.Enter_Value_In_Edit_Field(email_textField, value);
	}
	public void enter_password(String value) {
		Utility_methods.Enter_Value_In_Edit_Field(password_Textfield, value);
	}
	public void reEnter_password(String value) {
		Utility_methods.Enter_Value_In_Edit_Field(confirmpassword_textField, value);
	}
	public void click_register_button() {
		register_button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
