package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {
	public static void main(String[] args) {
	 
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("Reg")).click();
			driver.findElement(By.cssSelector("input[name=\"Gender\"]")).click();
			driver.findElement(By.id("FirstName")).sendKeys("CHINMAYI");
			driver.findElement(By.id("LastName")).sendKeys("MOHAN");
			driver.findElement(By.id("Email")).sendKeys("chinmayi02mohan@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("chin@123");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("chin@123");
			driver.findElement(By.id("register-button")).click();
			String value=driver.findElement(By.className("result")).getText();
			String expected="Your registration completed";
			if(value.equals(expected)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
	}
	}
	
	
	


