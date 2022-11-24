package Practice_Selenium;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng1 extends Browser_settings {
	
	@DataProvider(name="Test data")
	public Object[][] testdata(){
		Object[][] data=new Object[5][5];
		data[0][0]="suma";
		data[0][1]="k";
		data[0][2]="sumak2158@gmail.com";
		data[0][3]="suma123";
		data[0][4]="suma123";
		
		data[1][0]="lakshmi";
		data[1][1]="patil";
		data[1][2]="Lakshmiii968@gmail.com";
		data[1][3]="Lakshmi123";
		data[1][4]="Lakshmi123";
		
		data[2][0]="suhasi";
		data[2][1]="singh";
		data[2][2]="suhasisingh678@gmail.com";
		data[2][3]="suhasi123";
		data[2][4]="suhasi123";
		
		data[3][0]="aishwarya";
		data[3][1]="pujar";
		data[3][2]="pujar551234@gmail.com";
		data[3][3]="pujar123";
		data[3][4]="pujar123";
		
		data[4][0]="prerana";
		data[4][1]="gowda";
		data[4][2]="prerana1235@gmail.com";
		data[4][3]="prerana123";
		data[4][4]="prerana123";
		return data;
		
	}
	
@Test(dataProvider="Test data")
public void register(String firstname,String lastname,String email,String password,String confirmPassword) throws IOException {
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
	driver.findElement(By.id("register-button")).click();
	
	
		//TakesScreenshot ts=(TakesScreenshot) driver;
		//File temp=ts.getScreenshotAs(OutputType.FILE);
		//File desti=new File("./Screenshots/pic.png");
		//FileHandler.copy(temp, desti);

}
}

