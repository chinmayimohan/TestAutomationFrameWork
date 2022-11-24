package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_withactionclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		//action.moveToElement(search).click().sendKeys("mobiles").perform();
		//action.sendKeys(search,"mobiles").perform();
		Thread.sleep(5000);
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(search,"mobiles").sendKeys(Keys.PAGE_DOWN).perform();
		
	}

}
