package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_ComputersPage extends Utility_methods {
	public DW_ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="products-orderby")
	WebElement position_dropdown;
	
	@FindBy(name="products-viewmode")
	WebElement viewAs_dropdown;
	
	@FindBy(id="products-pagesize")
	WebElement display_dropdown;
	
	@FindBy(xpath="(//span[contains(text(),'1200.00')])[2]")
	WebElement filterByPrice_link;
	
	@FindBy(xpath="(//a[contains(text(),'Desktops')])[3]")
	WebElement desktop_link;
	
	@FindBy(xpath="(//a[contains(text(),'Build your')])[2]")
	WebElement selectedDesktop_link;
	
	@FindBy(xpath="(//input[contains(@value,\"Add\")])[1]")
	WebElement addToCart_button;
	
	public void select_sortBy() {
		dropdown_list_text(position_dropdown, "Name: A to Z");
	}
	
	public void select_viewAsGrid() {
		dropdown_list_text( viewAs_dropdown,"Grid");
	}
	public void select_displayas() {
		dropdown_list_text(display_dropdown,"4");
	}
	public void choose_filterByPrice() {
		Click_Element(filterByPrice_link);
	}
	public void desktop() throws InterruptedException {
		Click_Element(desktop_link);
		
	}
	public void Select_desktop() {
		Click_Element(selectedDesktop_link);
	}
	public void addToCart() {
		Click_Element(addToCart_button);
		
	}
}
