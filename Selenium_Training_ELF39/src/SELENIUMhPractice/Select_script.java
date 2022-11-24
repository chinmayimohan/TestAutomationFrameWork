package SELENIUMhPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_script {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/avail/services.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.xpath("//span[@id=\"BtFid\"]")).click();
		//driver.findElement(By.xpath("//span[text()='Bus Type']")).click();
		List <WebElement> type =driver.findElements(By.xpath("//span[@value=\"Bus Type\"]/following-sibling::li"));
		
		for(WebElement i:type)
		{
			System.out.println(i.getText());
		}
		
		driver.close();
		
	}

}
