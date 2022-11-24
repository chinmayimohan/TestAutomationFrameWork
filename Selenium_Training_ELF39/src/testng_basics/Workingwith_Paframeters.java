package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Workingwith_Paframeters {
	@Parameters({"URL","Product"})
	@Test
	public void paralleldemo1(String url,String value) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("small-searchterms")).sendKeys(value);
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		driver.close();
	}
}
