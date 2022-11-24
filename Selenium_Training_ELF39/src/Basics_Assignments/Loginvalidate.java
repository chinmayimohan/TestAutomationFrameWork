package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginvalidate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chinmayi02mohan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chin@123");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String actvalue=driver.findElement(By.className("account")).getText();
		String expvalue="chinmayi02mohan@gmail.com";
		if(actvalue.equals(expvalue)) {
			System.out.println("log in pass");
		}
		else {
			System.out.println("login fail");
		}
		
	}

}
