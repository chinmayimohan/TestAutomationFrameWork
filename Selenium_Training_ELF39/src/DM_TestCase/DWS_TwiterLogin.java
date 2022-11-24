package DM_TestCase;



import java.util.Set;

import org.testng.annotations.Test;


import Framework_utility.Base_test;
import POM_DemoWebshop.DWS_TwiiterPage;
import POM_DemoWebshop.DW_HomePage;



public class DWS_TwiterLogin extends Base_test {

	public DWS_TwiterLogin() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void twitterLogin() throws InterruptedException
	{
		DW_HomePage hp = new DW_HomePage(driver);
		hp.click_twitterlink();
		Set<String> webdrivers=driver.getWindowHandles();
		for(String o:webdrivers)
		{
			String title=driver.switchTo().window(o).getTitle();
			System.out.println(title);
		}
		
		
		
		
		DWS_TwiiterPage tp = new DWS_TwiiterPage(driver);
		tp.click_login();
		
		Thread.sleep(12000);
		
	}
	

}
