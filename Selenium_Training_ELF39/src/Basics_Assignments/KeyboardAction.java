package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		action.moveToElement(search).click().perform();
		//action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
		//action.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();
		action.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();
	}

}
