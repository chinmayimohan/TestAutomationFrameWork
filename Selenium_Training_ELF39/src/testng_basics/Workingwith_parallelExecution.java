package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Workingwith_parallelExecution {
@Test(invocationCount=3,threadPoolSize=2)
public void paralleldemo() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//Launch the chrome browser
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.close();
}
}
