package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_login {
	public class Dataproviders_login {
		@DataProvider(name="Test Data")
		public Object[][] login_data(){
			Object[][] data=new Object[5][2];
			
			data[0][0]="aaaB123@gmail.com";
			data[0][1]="chin@123";
			
			data[1][0]="bbbA123@gmail.com";
			data[1][1]="chin@123";
			
			data[2][0]="cccD123@gmail.com";
			data[2][1]="chin@123";
			
			data[3][0]="dddC123@gmail.com";
			data[3][1]="chin@123";
			
			data[4][0]="eeeF123@gmail.com";
			data[4][1]="chin@123";
			
			return data;
		}
		
		@Test(dataProvider="Test Data")
		public void testdata(String email,String password) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.className("email")).sendKeys(email);
			driver.findElement(By.className("password")).sendKeys(password);
			driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
			driver.close();
}}}
