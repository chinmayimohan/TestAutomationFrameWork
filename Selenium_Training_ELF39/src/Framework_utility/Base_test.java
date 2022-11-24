package Framework_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_test {
	public WebDriver driver;
	@BeforeClass
	public void Browser_setup() throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		String url=Utility_methods.Test_Configuration();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tear_down() {
		driver.close();
	}

}
