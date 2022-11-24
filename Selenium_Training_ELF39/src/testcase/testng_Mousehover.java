package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utility_methods;

public class testng_Mousehover extends Base_test {
	
	@Test
	public void advancedSearch() {
		
		WebElement computer=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(computer).perform();
		//driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]")).click();
		WebElement btn=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
		Utility_methods.Click_Element(btn);
	}
	
}
