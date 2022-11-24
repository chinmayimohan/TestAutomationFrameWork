package SELENIUMhPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Multi_clm {
	@Test
	public static void exceldemo() throws IOException {
		
		//Filepath
		String filepath="./TestData/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Register");
		int row_count=sheet.getPhysicalNumberOfRows();
		int clm_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row_count);
		System.out.println(clm_count);
		
		for(int i=0;i<=row_count;i++) {
			for(int j=0;j<clm_count;j++) {
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value);
			}
			System.out.println();
		}	
	}
}
