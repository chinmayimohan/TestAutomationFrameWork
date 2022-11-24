package SELENIUMhPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mobiles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(@href,\"/mobile-phones\")]")).click();
		driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();
		String mob=driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)')]/../../../..//span[@class=\"a-price\"]")).getText();
		System.out.println(mob);
		driver.close();
	}

}
