package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_basics1 {
	//testng is core annotation
	@Test
	//testng wrap method is test case
	public void demo() {
		//test steps
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		driver.close();
	}

}
