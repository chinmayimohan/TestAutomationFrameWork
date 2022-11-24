package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch the gecko browser
		WebDriver driver=new ChromeDriver();
		//Navigate through browser
		driver.get("https://www.google.co.in");
	}

}
