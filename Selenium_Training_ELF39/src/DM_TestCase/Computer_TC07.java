package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_ComputersPage;
import POM_DemoWebshop.DW_HomePage;

public class Computer_TC07 extends Base_test {
	@Test
	public void Books() throws InterruptedException {
		DW_HomePage hp=new DW_HomePage(driver);
		hp.computer_link();
		DW_ComputersPage cp=new DW_ComputersPage (driver);
		Thread.sleep(2000);
		cp.desktop();
		cp.select_sortBy();
		cp.select_viewAsGrid();
		cp.select_displayas();
		cp.choose_filterByPrice();
		cp.Select_desktop();
				
	}
	}


