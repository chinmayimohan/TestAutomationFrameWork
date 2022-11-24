package Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsA2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//parent window
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		//child 1
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String>tot_window=driver.getWindowHandles();
		System.out.println(tot_window);
		//for loop
		for(String child:tot_window) {
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			Thread.sleep(2000);
			driver.close();
		}}
		driver.switchTo().window(parent_window);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.close();
}
}
