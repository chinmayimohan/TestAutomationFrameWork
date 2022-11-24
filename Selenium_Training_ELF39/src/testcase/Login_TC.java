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

public class Login_TC extends Base_test {
	@DataProvider(name="LoginData")
	public Object[][] get_test_data() throws IOException{
		Object[][] data=Utility_methods.getTestData("Login");
		
		return data;
	}
	
	@Test(dataProvider="LoginData")
	public void login(String email,String password) {
	driver.findElement(By.className("ico-login")).click();
	//driver.findElement(By.id("Email")).sendKeys("abcdevyvyyyc@gmail.com");
	WebElement username=driver.findElement(By.id("Email"));
	Utility_methods.Enter_Value_In_Edit_Field(username, email);
	
	//driver.findElement(By.id("Password")).sendKeys("chin@123");
	WebElement password1=driver.findElement(By.id("Password"));
	Utility_methods.Enter_Value_In_Edit_Field(password1,password);
	
	WebElement logi_lnk=driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
	Utility_methods.Click_Element(logi_lnk);
	
}
		
}

