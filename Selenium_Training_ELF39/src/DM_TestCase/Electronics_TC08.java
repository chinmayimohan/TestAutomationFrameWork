package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_ElectronicsPage;
import POM_DemoWebshop.DW_HomePage;

public class Electronics_TC08 extends Base_test {
	@Test
	public void Books() throws InterruptedException {
		DW_HomePage hp=new DW_HomePage(driver);
		hp.electronics_link();
		DW_ElectronicsPage ep=new DW_ElectronicsPage (driver);
		Thread.sleep(2000);
		ep.cell_phone();
		ep.select_sortBy();
		ep.select_viewAsGrid();
		ep.select_displayas();
		ep.selected_phone();			
	}
}

