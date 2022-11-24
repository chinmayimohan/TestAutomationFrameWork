package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_HomePage extends Utility_methods {
public DW_HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(className="ico-register")
WebElement register_link;

@FindBy(xpath="//a[@class=\"ico-login\"]")
WebElement login_link;

@FindBy(xpath="//span[text()=\"Shopping cart\"]")
WebElement shopping_cart_link;

@FindBy(xpath="//span[text()=\"Wishlist\"]")
WebElement wishlist_link;

@FindBy(id="small-searchterms")
WebElement searchterms_textField;

@FindBy(xpath="//input[@value=\"Search\"]")
WebElement search_button;

@FindBy(name="pollanswers-1")
WebElement excellent_radiobutton;

@FindBy(id="vote-poll-1")
WebElement vote_button;

@FindBy(xpath="(//a[@href=\"/books\"])[1]")
WebElement books_button;

@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
WebElement computers_button;

@FindBy(xpath="(//a[contains(text(),'Electronics')])[3]")
WebElement Electronics_link;

@FindBy(xpath="(//a[contains(text(),'Jewelry')])[3]")
WebElement Jewelry_link;

@FindBy(xpath="//a[text()='Tricentis']")
WebElement tricentis_link;

@FindBy(xpath="//a[text()='Twitter']")
WebElement twitter_link;

@FindBy(xpath="(//a[@href=\"/contactus\"])")
WebElement clk_contactUsButton;

@FindBy(xpath="//a[@href=\"/privacy-policy\"]")
WebElement private_notice;

@FindBy(xpath="//a[@href=\"/producttag/all\"]")
WebElement viewAll_link;

public void click_register() {
	register_link.click();
}

public void click_login() {
	login_link.click();
}
public void search_field(String value) {
	Enter_Value_In_Edit_Field(searchterms_textField, value);
}
public void click_search_button() {
	Click_Element( search_button);
}
public void vote_Excellent() {
	Click_Element(excellent_radiobutton);
	Click_Element(vote_button);
}
public void book_link() {
	Click_Element(books_button);
}
public void computer_link() {
	Click_Element(computers_button);
}
public void jewelry_link() {
	Click_Element(Jewelry_link);
}
public void electronics_link() {
	Click_Element(Electronics_link);
}
public void shopping_cart_link() {
	Click_Element(shopping_cart_link);
}
public void wishlist_link() {
	Click_Element(wishlist_link);
}

public void click_tricentis() {
	Click_Element( tricentis_link);
	
}

public void click_twitterlink() {
	// TODO Auto-generated method stub
	Click_Element(twitter_link);
}

public void click_contactUs_button() {
	// TODO Auto-generated method stub
	Click_Element(clk_contactUsButton);
}

public void click_privacyNotice_link() {
	// TODO Auto-generated method stub
	Click_Element(private_notice);
}

public void click_viewAll_link() {
	// TODO Auto-generated method stub
	Click_Element(viewAll_link);
}}
