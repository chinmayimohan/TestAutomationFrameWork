package Assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utility_methods;

public class Wattpad extends Base_test{
	
	
	@DataProvider(name="Mobile_num")
	public Object[][] MobileNum_data() throws IOException {
		Object[][] data1=Utility_methods.getTestData("mobilenum");
		return data1;
	}
	/*@Test(priority=1)
	public void cowinloginsearch() {
		WebElement Login_Button=driver.findElement(By.xpath("By.xpath(\"//input[@formcontrolname=\\\"mobile_number\\\"]\""));
		Utility_methods.Click_Element(Login_Button);*/
	
	@Test(dataProvider="Mobile_num")
		public void mob_no(String mob_no) {
		WebElement Login_Button=driver.findElement(By.xpath("//a[contains(text(),' Register / Sign In ')]"));
		Utility_methods.Click_Element(Login_Button);
		
		/*WebElement Enter_mobile_num=driver.findElement(By.xpath("//input[@formcontrolname=\"mobile_number\"]"));
		Utility_methods.Enter_Value_In_Edit_Field(Enter_mobile_num, mob_no);
		WebElement get_otp_btn=driver.findElement(By.xpath("//ion-button[@type=\"button\"]"));
		Utility_methods.Click_Element(get_otp_btn);*/
		
	}
	//@Test(dataProvider="SignUp_data")
	//public Object[][] wattpad_Signup()

	}

