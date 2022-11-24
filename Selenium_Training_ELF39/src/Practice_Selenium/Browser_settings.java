package Practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser_settings {
	WebDriver driver;
@BeforeClass
public void browser_launch() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterClass

public void browser_Close() {
	driver.close();
}

}
