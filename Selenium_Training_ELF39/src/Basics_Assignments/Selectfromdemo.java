package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectfromdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/demo.html");
		driver.manage().window().maximize();
		WebElement select_car=driver.findElement(By.id("standard_cars"));
		Select sel=new Select(select_car);
		Thread.sleep(2000);
		List<WebElement> car=sel.getOptions();
		System.out.println(car.size());
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByValue("bmw");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		driver.close();
		
	}

}
