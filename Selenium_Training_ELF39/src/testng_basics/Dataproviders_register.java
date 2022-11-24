package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders_register {
	@DataProvider(name="Test Data")
	public Object[][] register(){
		Object[][] data=new Object[5][5];
		data[0][0]="chinmayi";
		data[0][1]="mohan";
		data[0][2]="aaaB123@gmail.com";
		data[0][3]="chin@123";
		data[0][4]="chin@123";
		data[1][0]="skanda";
		data[1][1]="sai M";
		data[1][2]="bbbA123@gmail.com";
		data[1][3]="chin@123";
		data[1][4]="chin@123";
		data[2][0]="bunty";
		data[2][1]="bhaskaran";
		data[2][2]="cccD123@gmail.com";
		data[2][3]="chin@123";
		data[2][4]="chin@123";
		data[2][0]="tuntun";
		data[2][1]="aunty";
		data[2][2]="dddC123@gmail.com";
		data[2][3]="chin@123";
		data[2][4]="chin@123";
		data[3][0]="chota";
		data[3][1]="bheem";
		data[3][2]="eeeF123@gmail.com";
		data[3][3]="chin@123";
		data[3][4]="chin@123";
		data[4][0]="tom";
		data[4][1]="jerry";
		data[4][2]="fffE123@gmail.com";
		data[4][3]="chin@123";
		data[4][4]="chin@123";
		return data;
		
	}
	@Test(dataProvider="Test Data")
	public void testdata(String firstname,String lastname,String email,String password,String confirmpassword ) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.id("register-button")).click();
		driver.close();
		
	}
	

}
