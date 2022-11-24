package Basics_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeNavigaterefresh {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.linkedin.com");
	\
		driver.manage().window().maximize();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	}
}
