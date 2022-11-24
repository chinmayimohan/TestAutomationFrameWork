package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_BooksPage extends Utility_methods {
	public DW_BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="products-orderby")
	WebElement position_dropdown;
	
	@FindBy(name="products-viewmode")
	WebElement viewAs_dropdown;
	
	@FindBy(id="products-pagesize")
	WebElement display_dropdown;
	
	@FindBy(xpath="(//span[@class=\"PriceRange\"])[1]")
	WebElement filterByPrice_link;
	
	@FindBy(xpath="(//a[contains(text(),'Computing')])[2]")
	WebElement book_link;
	
	@FindBy(id="add-to-cart-button-13")
	WebElement addToCart_button;
	
	public void select_sortBy() {
		dropdown_list_text(position_dropdown, "Name: A to Z");
	}
	
	public void select_viewAsGrid() {
		dropdown_list_text( viewAs_dropdown,"List");
	}
	public void select_displayas() {
		dropdown_list_text(display_dropdown,"4");
	}
	public void choose_filterByPrice() {
		Click_Element(filterByPrice_link);
	}
	public void book() throws InterruptedException {
		Click_Element(book_link);
		
	}
	public void addToCart() {
		Click_Element(addToCart_button);
		
	}
}
