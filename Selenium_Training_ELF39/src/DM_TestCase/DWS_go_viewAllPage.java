package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;

public class DWS_go_viewAllPage extends Base_test{

	public DWS_go_viewAllPage() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void viewAll()
	{
		DW_HomePage hp = new DW_HomePage(driver);
		hp.click_viewAll_link();
	}
	

}