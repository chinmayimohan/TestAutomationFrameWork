package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_JewelryPage extends Utility_methods {
	public DW_JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="products-orderby")
	WebElement position_dropdown;
	
	@FindBy(name="products-viewmode")
	WebElement viewAs_dropdown;
	
	@FindBy(id="products-pagesize")
	WebElement display_dropdown;
	
	@FindBy(xpath="//ul[@class=\"price-range-selector\"]/li[3]")
	WebElement filterByPrice_link;
	
	@FindBy(xpath="//a[contains(text(),'Vintage Style Three Stone Diamond Engagement')]")
	WebElement selectedjwelery_link;
	
	@FindBy(xpath="(//a[@href=\"/jewelry?orderby=5&pagesize=4&pagenumber=2\"])[1]")
	WebElement next_pg;
	
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
	public void jewelry() throws InterruptedException {
		Click_Element(selectedjwelery_link);
		
	}
	public void next_pg_clk(){
		Click_Element(next_pg);
	
}}


