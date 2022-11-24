package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign_search {
	public class Dataproviders_search {
		@DataProvider(name="Test Data")
		public Object[][] register(){
			Object[][] data=new Object[5][1];
			
			data[0][0]="books";
			
			data[1][0]="mobiles";
			
			data[2][0]="computers";
			
			data[3][0]="chocolates";
			
			data[4][0]="electronics";
			
			return data;
		}
		
		@Test(dataProvider="Test Data")
		public void testdata(String product) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("small-searchterms")).sendKeys(product);
			driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
			driver.close();
}}}

