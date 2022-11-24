package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsradiobutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> Rbuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<=Rbuttons.size()-1;i++) {
			Rbuttons.get(i).click();
			Thread.sleep(2000);
		}
	}	
}
