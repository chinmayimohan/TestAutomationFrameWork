package Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetoptionsDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	WebElement select_val=driver.findElement(By.id("products-orderby"));
	Select selectlist=new Select(select_val);
	List<WebElement> optn=selectlist.getOptions();
	for(int i=0;i<=optn.size()-1;i++) {
		System.out.println(optn.get(i).getText());
	}

}
}
