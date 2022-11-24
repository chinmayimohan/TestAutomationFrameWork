package testng_basics;

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

public class Working_reg extends Base_test {
	
	@DataProvider(name="Test Data")
	public static Object[][] loginCred() throws IOException {
		String filepath="./TestData/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Login");
		int row_count=sheet.getPhysicalNumberOfRows();
		int clm_count=sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(row_count);
		//System.out.println(clm_count);
		
		Object[][] data =new Object[row_count-1][clm_count];
		
		//String value=sheet.getRow(0).getCell(0).getStringCellValue();
		//String value1=sheet.getRow(0).getCell(1).getStringCellValue();
		
		for(int row=1;row<row_count;row++) {
			for(int clm=0;clm<clm_count;clm++) {
				data[row-1][clm]=sheet.getRow(row).getCell(clm).getStringCellValue();
						}
				}
		return data;
		}
		
		@Test(dataProvider="Test Data")
		public void login(String email,String password) {
		driver.findElement(By.className("ico-login")).click();
		
		WebElement username=driver.findElement(By.id("Email"));
		Utility_methods.Enter_Value_In_Edit_Field(username, email);
		
		
		WebElement password1=driver.findElement(By.id("Password"));
		Utility_methods.Enter_Value_In_Edit_Field(password1,password);
		
		WebElement logi_lnk=driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
		Utility_methods.Click_Element(logi_lnk);
	}}
