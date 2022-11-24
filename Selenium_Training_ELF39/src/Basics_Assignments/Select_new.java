package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_new {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/demo.html");
		driver.manage().window().maximize();
		WebElement select_car=driver.findElement(By.id("standard_cars"));
		Select sel=new Select(select_car);
		Thread.sleep(2000);
		List<WebElement> car=sel.getOptions();
		for(WebElement i:car)
		{
			System.out.println(i.getText());
		}
		driver.close();
		
	}

}

