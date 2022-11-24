package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utility_methods;

public class Search_TC extends Base_test {
	@DataProvider(name="Product_Test_Data")
	public Object[][] searchTestData() throws IOException{
		Object[][] data=Utility_methods.getTestData("Search");
		return data;
	}
	
	@Test(dataProvider="Product_Test_Data")
	public void search(String products) {
		
		//driver.findElement(By.id("small-searchterms")).sendKeys(products);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Utility_methods.Enter_Value_In_Edit_Field(search, products);
		
		//driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		WebElement search_clk=driver.findElement(By.xpath("//input[@value=\"Search\"]"));
		Utility_methods.Click_Element(search_clk);
	}
	
}
