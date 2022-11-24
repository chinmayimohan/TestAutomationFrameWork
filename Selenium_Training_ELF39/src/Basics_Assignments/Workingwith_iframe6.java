package Basics_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_iframe6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.partialLinkText("Log")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.close();
	}
}
