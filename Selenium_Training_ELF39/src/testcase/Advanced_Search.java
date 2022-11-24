package testcase;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utility_methods;

public class Advanced_Search extends Base_test {
	@DataProvider(name="Advanced_Search_Test Data")
	public Object[][] advancedSearchtestData() throws IOException{
		Object[][] data=Utility_methods.getTestData("Advanced_search");
		
		return data;
	}
	@Test(dataProvider="Advanced_Search_Test Data")
	public void advancedSearch(String prod,String id_no,String vtext,String value,String to_value) {
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		WebElement adv_search=driver.findElement(By.id("small-searchterms"));
		Utility_methods.Enter_Value_In_Edit_Field(adv_search, prod);
		
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebElement advsearch_btn=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		Utility_methods.Click_Element(advsearch_btn);
		
		//driver.findElement(By.id("As")).click();
		WebElement checkbox=driver.findElement(By.id("As"));
		Utility_methods.Click_Element(checkbox);
		
		
		//Select select=new Select(driver.findElement(By.id("Cid")));
		//select.selectByIndex(5);
		WebElement category=driver.findElement(By.id("Cid"));
		Utility_methods.dropdown_list_value(category,id_no );
		
		//driver.findElement(By.id("Isc")).click();
		WebElement search_subcategory=driver.findElement(By.id("Isc"));
		Utility_methods.Click_Element(search_subcategory);
		
		//Select manufacturer=new Select(driver.findElement(By.id("Mid")));
		WebElement manufacturer=driver.findElement(By.id("Mid"));
		//manufacturer.selectByVisibleText("Tricentis");
		Utility_methods.dropdown_list_text(manufacturer, vtext);
		
		//driver.findElement(By.id("Pf")).sendKeys(value);
		WebElement pricefrom=driver.findElement(By.id("Pf"));
		Utility_methods.Enter_Value_In_Edit_Field( pricefrom, value);
		
		//driver.findElement(By.id("Pt")).sendKeys(value);
		WebElement priceto=driver.findElement(By.id("Pt"));
		Utility_methods.Enter_Value_In_Edit_Field(priceto, to_value);
		
		//driver.findElement(By.id("Sid")).click();
		WebElement searchin_product_dis=driver.findElement(By.id("Sid"));
		Utility_methods.Click_Element(searchin_product_dis);
		
		//driver.findElement(By.xpath("(//input[contains(@class,\"button-1\")])[1]")).click();
		WebElement searchbutton=driver.findElement(By.xpath("(//input[contains(@class,\"button-1\")])[1]"));
		Utility_methods.Click_Element(searchbutton);
		
		Alert ele=driver.switchTo().alert();
		ele.accept();
			}
}


