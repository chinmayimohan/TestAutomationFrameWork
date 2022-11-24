package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_AdvancedSearchPage extends Utility_methods {
	public DW_AdvancedSearchPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="As")
	WebElement advancedSearch_checkbox;
	
	@FindBy(id="Cid")
	WebElement category_dropdown;
	
	@FindBy(name="Isc")
	WebElement AutomaticallySearchSubCatogries_checkbox;
	
	@FindBy(id="Mid")
	WebElement manufacturer_Dropdown;
	
	@FindBy(className="price-from")
	WebElement priceFrom_Textfield;
	
	@FindBy(className="price-to")
	WebElement priceto_Textfield;
	
	@FindBy(name="Sid")
	WebElement searchInProductDescription_checkbox;
	
	@FindBy(xpath="(//input[@value=\"Search\"])[2]")
	WebElement search_button;
	
	public void check_advancesearch() {
		advancedSearch_checkbox.click();
	}
	public void Select_categorylist() {
		dropdown_list_text(category_dropdown,"Computers");
	}
	public void check_SearchSubCatogries() {
		AutomaticallySearchSubCatogries_checkbox.click();
	}
	public void select_Manufacturer() {
		dropdown_list_text(manufacturer_Dropdown, "Tricentis");
	}
	public void enter_fromPrice(String value) {
		Enter_Value_In_Edit_Field(priceFrom_Textfield, value);
	}
	public void enter_toPrice(String value) {
		Enter_Value_In_Edit_Field(priceto_Textfield, value);
	}
	public void check_productDescription() {
		searchInProductDescription_checkbox.click();
	}
	public void click_searchbutton() {
		search_button.click();
		
	}
	
	
	
	
}




