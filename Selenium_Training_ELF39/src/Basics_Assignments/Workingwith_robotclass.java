package Basics_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwith_robotclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement fileupload=driver.findElement(By.id("resume"));
		Actions action=new Actions(driver);
		action.moveToElement(fileupload).click().perform();
		Thread.sleep(1000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		for(int i=0;i<=2;i++) {
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
