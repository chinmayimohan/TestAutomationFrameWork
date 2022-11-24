package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String value=driver.findElement(By.linkText("Register")).getAttribute("class");
		System.out.println(value);
		String value1=driver.findElement(By.id("bar-notification")).getAttribute("class");
		System.out.println(value1);
		String value2=driver.findElement(By.linkText("Shopping cart")).getAttribute("class");
		System.out.println(value2);
		String value3=driver.findElement(By.id("small-searchterms")).getAttribute("type");
		System.out.println(value3);
		String value4=driver.findElement(By.className("ui-helper-hidden-accessible")).getAttribute("aria-live");
		System.out.println(value4);
	}

}
