package Basics_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_wait1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,25);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ico-register")))).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gender-female")))).click();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("chinmayi");
		driver.findElement(By.id("LastName")).sendKeys("mohan");
		driver.findElement(By.name("Email")).sendKeys("xxxy769@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chin@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chin@123");
		driver.findElement(By.id("register-button")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value=\"Continue\"]")))).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		driver.close();
	}

}
