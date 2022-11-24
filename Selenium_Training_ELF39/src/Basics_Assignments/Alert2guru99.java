package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert2guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions action = new Actions(driver);
		List<WebElement> drop=driver.findElements(By.xpath("(//span[text()=\"Edit\"]/../../li/span)"));
		for(int i=0;i<drop.size();i++) {
		action.contextClick(right_click).build().perform();
		Thread.sleep(2000);
		drop.get(i).click();
		Thread.sleep(2000);
		Alert ele=driver.switchTo().alert();
		ele.accept();
	
		}	
		
}
}
