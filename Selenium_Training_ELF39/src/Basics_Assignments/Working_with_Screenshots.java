package Basics_Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_Screenshots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("chinmayi");
		driver.findElement(By.id("LastName")).sendKeys("mohan");
		driver.findElement(By.id("Email")).sendKeys("axyxyxy1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("chin123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chin123");
		
		//take screenshot typecasting with driver instance
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepages=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./ScreenShots/screenshot2.png");
		FileHandler.copy(homepages, destination);
		
		driver.findElement(By.id("register-button")).click();
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File st=new File("./ScreenShots/screenshot3.png");
		FileHandler.copy(ss, st);
		driver.close();
		
	}
	
	}


