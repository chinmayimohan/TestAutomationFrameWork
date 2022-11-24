package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String text_value=driver.findElement(By.linkText("Register")).getText();
		System.out.println(text_value);
		String value=driver.findElement(By.linkText("Log in")).getText();
		System.out.println(value);
		String print_value=driver.findElement(By.className("cart-label")).getText();
		System.out.println(print_value);
		String print=driver.findElement(By.linkText("Wishlist")).getText();
		System.out.println(print);
		
		
	}

}
