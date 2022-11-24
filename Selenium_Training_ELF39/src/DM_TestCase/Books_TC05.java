package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_BooksPage;
import POM_DemoWebshop.DW_HomePage;

public class Books_TC05 extends Base_test {
@Test
public void Books() throws InterruptedException {
	DW_HomePage hp=new DW_HomePage(driver);
	hp.book_link();
	DW_BooksPage bp=new DW_BooksPage(driver);
	bp.select_sortBy();
	bp.select_viewAsGrid();
	bp.select_displayas();
	bp.choose_filterByPrice();
	Thread.sleep(2000);
	bp.book();
	
			
}
}
