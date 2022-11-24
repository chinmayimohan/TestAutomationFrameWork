package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsLinktext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> Lbuttons=driver.findElements(By.xpath("//a"));
		int count=0;
		for(int i=0;i<=Lbuttons.size()-1;i++) {
			System.out.println(Lbuttons.get(i).getText());
			count++;
		}
			System.out.println("number of links "+count);
		}

}
