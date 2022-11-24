package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_With_Excel {
@Test
public static void exceldemo() throws IOException {
	
	//Filepath
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
			//System.out.print(" "+data[row][clm]+"  ");
			}
		//System.out.println();
	}
	//for(int i=0;i<=data.length-1;i++) {
		//for(int j=0;j<data[i].length-1;j++) {
			
			//System.out.print(data[i][j]);
	//System.out.println(value+""+value1);
	
	//System.out.println(sheet.getRow(1).getCell(0).getStringCellValue()+""+sheet.getRow(1).getCell(1).getStringCellValue());
}
		//System.out.println();
}