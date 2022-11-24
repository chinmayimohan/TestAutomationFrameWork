package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_LoginPage {
public DW_LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(className="email")
WebElement email_textField;

@FindBy(className="password")
WebElement password_Textfield;

@FindBy(id="RememberMe")
WebElement rememberMe_checkbox;

@FindBy(xpath="//input[@value=\"Log in\"]")
WebElement login_button;

public void enter_email(String value) {
	Utility_methods.Enter_Value_In_Edit_Field(email_textField, value);
}
public void enter_password(String value) {
	Utility_methods.Enter_Value_In_Edit_Field(password_Textfield, value);
}
public void login_click() {
	//Utility_methods.Click_Element(login_button);
	login_button.click();
}
}













