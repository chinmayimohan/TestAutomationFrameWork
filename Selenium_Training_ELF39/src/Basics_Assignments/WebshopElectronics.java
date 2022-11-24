package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebshopElectronics {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"))).click().perform();
	}

}
