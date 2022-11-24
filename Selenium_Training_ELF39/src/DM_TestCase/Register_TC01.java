package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;
import POM_DemoWebshop.DW_RegisterPage;

public class Register_TC01 extends Base_test {
@Test
public void To_Register() {
	DW_HomePage hp=new DW_HomePage(driver);
	hp.click_register();
	DW_RegisterPage rp=new DW_RegisterPage(driver);
	rp.clk_radioButton();
	rp.enter_FirstName("chota");
	rp.enter_LastName("bheem");
	rp.enter_Email("queens123@gmail.com");
	rp.enter_password("queen@123");
	rp.reEnter_password("queen@123");
	rp.click_register_button();
}

}
