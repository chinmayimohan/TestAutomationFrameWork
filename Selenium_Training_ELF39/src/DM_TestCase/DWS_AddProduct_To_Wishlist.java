package DM_TestCase;



import org.testng.annotations.Test;
import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;

public class DWS_AddProduct_To_Wishlist extends Base_test {

	public DWS_AddProduct_To_Wishlist() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void add_Product_To_Wishlist()
	{
		DW_HomePage hp=new DW_HomePage(driver);
		hp.wishlist_link();
		
		
	}
	
	

}
