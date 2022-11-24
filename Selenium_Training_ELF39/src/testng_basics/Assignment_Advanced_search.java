package testng_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_Advanced_search {
	@DataProvider(name="Test Data")
	public Object[][] register(){
		Object[][] data=new Object[5][1];
		
		data[0][0]="30000";
		
		
		data[1][0]="25000";
		
		
		data[2][0]="15000";
		
		
		data[3][0]="40000";
		
		
		data[4][0]="60000";
		
		return data;
	}

	@Test(dataProvider="Test Data")
		public void testdata(String price) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.id("As")).click();
		Select select=new Select(driver.findElement(By.id("Cid")));
		select.selectByIndex(5);
		driver.findElement(By.id("Isc")).click();
		Select manufacturer=new Select(driver.findElement(By.id("Mid")));
		manufacturer.selectByVisibleText("Tricentis");
		driver.findElement(By.id("Pf")).sendKeys(price);
		driver.findElement(By.id("Pt")).sendKeys(price);
		driver.findElement(By.id("Sid")).click();
		driver.findElement(By.xpath("(//input[contains(@class,\"button-1\")])[1]")).click();
		Alert ele=driver.switchTo().alert();
		ele.accept();
		driver.close();

}}
