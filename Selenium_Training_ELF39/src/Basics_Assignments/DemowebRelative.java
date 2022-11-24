package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebRelative {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("CHINMAYI");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("MOHAN");
	driver.findElement(By.xpath("//input[@data-val-required='Email is required.']")).sendKeys("chinmayi678@gmail.com");
	driver.findElement(By.xpath("//input[@class='text-box single-line password']")).sendKeys("chin@123");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("chin@123");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
}

}
