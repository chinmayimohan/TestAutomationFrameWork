package DM_TestCase;





import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DWS_ContactUsPage;
import POM_DemoWebshop.DW_HomePage;


public class DWS_ContactUs extends Base_test {

	public DWS_ContactUs() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void contactUs()
	{
		DW_HomePage hp = new DW_HomePage(driver);
		hp.click_contactUs_button();
		
		DWS_ContactUsPage cup = new DWS_ContactUsPage(driver);
		cup.sendTo_fullname_feild("chinmayi");
		cup.sendTo_email_feild("chinmayi@gmail.com");
		cup.sendTo_textArea_feild(" jsfusaf gsagcgas");
		cup.click_submitButton();
		
		
	}

}
