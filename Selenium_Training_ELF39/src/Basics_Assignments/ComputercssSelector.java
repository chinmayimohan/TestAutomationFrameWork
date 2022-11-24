package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputercssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]")).sendKeys("computer");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.close();
	}

}
