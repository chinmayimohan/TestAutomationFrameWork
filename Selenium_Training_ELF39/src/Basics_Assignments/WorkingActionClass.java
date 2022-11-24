package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		action.moveToElement(computers).build().perform();
	
		
	}

}
