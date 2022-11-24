package Basics_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_iframe5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[contains(@value,'Search ')]")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
	}

}
