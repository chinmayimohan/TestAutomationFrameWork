package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Systemtestingdemowebshop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Chinmayi");
		driver.findElement(By.id("LastName")).sendKeys("Mohan");
		driver.findElement(By.id("Email")).sendKeys("chinmayi118@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("chin@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("chin@123");
		driver.findElement(By.xpath("(//input[@id='register-button'])")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.findElement((By.className("ico-login"))).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("chinmayi118@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chin@123");
		driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
		WebElement select_sort=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(select_sort);
		sel.selectByVisibleText("Name: Z to A");
		WebElement select_view=driver.findElement(By.id("products-viewmode"));
		Select sel1=new Select(select_view);
		sel1.selectByVisibleText("List");
		WebElement select_display=driver.findElement(By.id("products-pagesize"));
		Select sel2=new Select(select_display);
		sel2.selectByIndex(2);
		List<WebElement> books_txt=driver.findElements(By.xpath("//div[@class='product-list']//a"));
		for(int i=1;i<books_txt.size();i++) {
			System.out.println(books_txt.get(i).getText());
		}
		
	}
}
		
		
		
		
		
		
		
	

	
