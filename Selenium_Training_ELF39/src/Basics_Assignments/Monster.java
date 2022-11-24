package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monster {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		WebElement allJobs=driver.findElement(By.xpath("(//a[@data-check=\"menutab\"])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(allJobs).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).click().perform();
		//action.moveToElement(driver.findElement(By.xpath("(//ul[@class='next-level-list'])[1]/li[7]"))).click().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),\"Java Jobs\")])[1]"))).click().perform();
	}

}
