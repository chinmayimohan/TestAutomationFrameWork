package Framework_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utility_methods {
	WebDriver driver;
	//utility method for sendkeys
	public static void Enter_Value_In_Edit_Field(WebElement element,String value) {
		element.sendKeys(value);
	}
	//utility method to clear default values
	public static void Enter_Value_In_Edit_Field_clear(WebElement element) {
		element.clear();
	}
	//utility method for Click
	public static void Click_Element(WebElement element) {
		element.click();
	}
	//utility method for dropdown
	public static void dropdown_list_id(WebElement element,int id_no) {
		Select select=new Select(element);
		select.selectByIndex(id_no);
		
	}
	public static void dropdown_list_value(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
		
	}
	public static void dropdown_list_text(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	//Utility method for test configuration parameters
	public static String Test_Configuration() throws IOException {
		String filepath="./Test_Configuration/TestConfigurationproperties";
		FileInputStream fis=new FileInputStream(filepath);
		
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("URL");
		return url;
	}
	public static Object[][] getTestData(String sheetname) throws IOException {
		String filepath="./TestData/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet(sheetname);
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
	//utility Method To Capture Screen_Shot
	public String capture_Screen_Shot(String stepname) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destPath="./SnapShot/"+stepname+".png";
		FileHandler.copy(src, new File(destPath));
		
		return "."+destPath;
	}
	
	}

