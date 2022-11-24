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

public class Register_TC extends Base_test {
	@DataProvider(name="RegisterData")
	public Object[][] get_test_data() throws IOException{
		Object[][] data=Utility_methods.getTestData("Register");
	
		return data;
	}
@Test(dataProvider="RegisterData")
public void register(String frstname,String lstname,String email,String password,String confirmpassword ) {
	
	//driver.findElement(By.className("ico-register")).click();
	WebElement reg_clk=driver.findElement(By.className("ico-register"));
	Utility_methods.Click_Element(reg_clk);
	
	//driver.findElement(By.id("gender-female")).click();
	WebElement rad_btn=driver.findElement(By.id("gender-female"));
	Utility_methods.Click_Element(rad_btn);
	
	//driver.findElement(By.id("FirstName")).sendKeys("chinmayi");
	WebElement firstname=driver.findElement(By.id("FirstName"));
	Utility_methods.Enter_Value_In_Edit_Field(firstname, frstname);
	
	//driver.findElement(By.id("LastName")).sendKeys("mohan");
		WebElement lastname=driver.findElement(By.id("LastName"));
	Utility_methods.Enter_Value_In_Edit_Field(lastname, lstname);
	
	//driver.findElement(By.id("Email")).sendKeys("abcdevyvyyyc@gmail.com");
	WebElement email_add=driver.findElement(By.id("Email"));
	Utility_methods.Enter_Value_In_Edit_Field(email_add, email);
	
	//driver.findElement(By.id("Password")).sendKeys("chin@123");
	WebElement pass=driver.findElement(By.id("Password"));
	Utility_methods.Enter_Value_In_Edit_Field(pass, password);
	
	//driver.findElement(By.id("ConfirmPassword")).sendKeys("chin@123");
	WebElement confirmpass=driver.findElement(By.id("ConfirmPassword"));
	Utility_methods.Enter_Value_In_Edit_Field(confirmpass, confirmpassword);
	
	//driver.findElement(By.id("register-button")).click();
	WebElement button=driver.findElement(By.id("register-button"));
	Utility_methods.Click_Element(button);
	
}
}
