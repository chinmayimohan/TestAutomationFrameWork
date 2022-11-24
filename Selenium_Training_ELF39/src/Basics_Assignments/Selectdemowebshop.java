package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdemowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();
		WebElement Select_ele=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(Select_ele);
		sel.selectByVisibleText("Name: Z to A");
		WebElement Select_ele2=driver.findElement(By.id("products-pagesize"));
		Select sel2=new Select(Select_ele2);
		sel2.selectByVisibleText("4");
		WebElement Select_ele3=driver.findElement(By.id("products-viewmode"));
		Select sel3=new Select(Select_ele3);
		sel3.selectByIndex(1);
		Thread.sleep(1000);
	}
}
		
		
		
		

