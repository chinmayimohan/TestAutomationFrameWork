package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/xpath1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("chinmayi");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("mohan");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("acenture");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("mysore");
	}

}
