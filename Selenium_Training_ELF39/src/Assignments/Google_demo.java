package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utility_methods;

public class Google_demo extends Base_test{
@DataProvider(name="product_data")
public Object[][] Gsearch() throws IOException {
	Object[][] data=Utility_methods.getTestData("Search");
	return data;
}
@Test(dataProvider="product_data")
public void Google_search(String product) {
	WebElement search_txtField=driver.findElement(By.xpath("//input[@aria-label=\"Search\"]"));
	Utility_methods.Enter_Value_In_Edit_Field_clear(search_txtField);
	Utility_methods.Enter_Value_In_Edit_Field(search_txtField, product);
	WebElement search_btn=driver.findElement(By.xpath("//button[@aria-label=\"Search\"]"));
	Utility_methods.Click_Element(search_btn);
}

}
