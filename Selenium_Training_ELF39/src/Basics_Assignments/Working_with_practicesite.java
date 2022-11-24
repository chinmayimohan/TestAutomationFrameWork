package Basics_Assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Working_with_practicesite {
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				List<WebElement>radio_button=driver.findElements(By.className("radioButton"));
				for(int i=0;i<=radio_button.size()-1;i++) {
					radio_button.get(i).click();
				}
				driver.findElement(By.id("autocomplete")).sendKeys("ind");
				driver.findElement(By.id("ui-id-3")).click();
				WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
				Select s=new Select(dropdown);
				List<WebElement>options=s.getOptions();
				for(int i=0;i<=options.size()-1;i++) {
					s.selectByIndex(i);
				}
				String parent=driver.getWindowHandle();
				System.out.println(parent);
				driver.findElement(By.id("openwindow")).click();
				Set<String> total=driver.getWindowHandles();
				System.out.println(total);
				for(String child:total) {
					String title=driver.switchTo().window(child).getTitle();
					System.out.println(title);
					if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {
						driver.findElement(By.linkText("Register")).click();
						driver.close();
					}
				}
				driver.switchTo().window(parent);
				driver.findElement(By.name("radioButton")).click();
				driver.findElement(By.name("enter-name")).sendKeys("chinmayi");
				driver.findElement(By.id("confirmbtn")).click();
				Alert ale=driver.switchTo().alert();
				ale.accept();
				
				Actions action=new Actions(driver);
				action.sendKeys(Keys.PAGE_DOWN);
				Thread.sleep(2000);
				action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Mouse')]"))).build().perform();
				driver.findElement(By.xpath("//a[text()='Reload']")).click();
				Thread.sleep(2000);
				driver.switchTo().frame(0);
				driver.findElement(By.linkText("Courses")).click();
				
				
				
	}

}
