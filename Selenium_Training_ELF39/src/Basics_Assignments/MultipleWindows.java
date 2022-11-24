package Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String parent_window=driver.getWindowHandle();
	System.out.println(parent_window);
	driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	Thread.sleep(2000);
	Set<String> total_windows=driver.getWindowHandles();
	System.out.println(total_windows);
	
	for(String child_windows:total_windows) {
		driver.switchTo().window(child_windows);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			driver.findElement(By.name("email")).sendKeys("xxxx@gmail.com");
			Thread.sleep(2000);
			driver.close();
		}
		}
	//switch back to parent window
	driver.switchTo().window(parent_window);
	driver.close();
	
}}
