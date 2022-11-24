package POM_DemoWebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utility_methods;

public class DW_ElectronicsPage extends Utility_methods{
	public DW_ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="products-orderby")
	WebElement position_dropdown;
	
	@FindBy(name="products-viewmode")
	WebElement viewAs_dropdown;
	
	@FindBy(id="products-pagesize")
	WebElement display_dropdown;
	
		
	@FindBy(xpath="(//a[contains(text(),'Cell phones')])[3]")
	WebElement cellPhone_link;
	
	@FindBy(xpath="(//a[contains(text(),'Used phone')])")
	WebElement selected_phone_link;
	
	public void select_sortBy() {
		dropdown_list_text(position_dropdown, "Name: A to Z");
	}
	
	public void select_viewAsGrid() {
		dropdown_list_text( viewAs_dropdown,"Grid");
	}
	public void select_displayas() {
		dropdown_list_text(display_dropdown,"4");
	}
	public void cell_phone() throws InterruptedException {
		Click_Element(cellPhone_link);
	}
	public void selected_phone(){
		Click_Element(selected_phone_link);
	}
	
}
