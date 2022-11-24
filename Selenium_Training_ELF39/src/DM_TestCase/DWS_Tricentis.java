package DM_TestCase;




import org.testng.annotations.Test;
import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;

public class DWS_Tricentis extends Base_test{

	public DWS_Tricentis() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void tricentis()
	{
		DW_HomePage hp = new DW_HomePage(driver);
		hp.click_tricentis();
	}
	

}
