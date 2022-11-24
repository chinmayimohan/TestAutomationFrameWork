package Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input")).sendKeys("CHINMAYI");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("MOHAN");
		driver.findElement(By.xpath("/html/body/div[2]/input")).sendKeys("TEST YANTRA");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("BENGALURU");
		driver.close();
	}

}
