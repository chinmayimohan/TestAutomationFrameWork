package Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowsA4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//parent window
		driver.get("file:///E:/selenium/MultipleWindow.html");
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		driver.findElement(By.xpath("//input[contains(@value,'Food')]")).click();
		Thread.sleep(2000);
		Set<String> tot_windows=driver.getWindowHandles();
		System.out.println(tot_windows);
		for(String child_window:tot_windows) {
			driver.switchTo().window(child_window);
			if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
				driver.close();
			}
		}
	}
}
