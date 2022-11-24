package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebpageeditablefield {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/demo.html");
		driver.manage().window().maximize();
		List<WebElement> Efield=driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<=Efield.size()-1;i++) {
			
		
			Efield.get(i).sendKeys("chinmayi");
		
	}
}}
