package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;
import POM_DemoWebshop.DW_JewelryPage;

public class Jwelery_TC09 extends Base_test{
	@Test
	public void jewelry() throws InterruptedException {
		DW_HomePage hp=new DW_HomePage(driver);
		hp.jewelry_link();
		DW_JewelryPage jp=new DW_JewelryPage (driver);
		jp.select_sortBy();
		jp.select_viewAsGrid();
		jp.select_displayas();
		//jp.choose_filterByPrice();
		Thread.sleep(2000);
		jp.next_pg_clk();
		jp.jewelry();
		
	}}	