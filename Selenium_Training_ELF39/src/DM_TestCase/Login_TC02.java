package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;
import POM_DemoWebshop.DW_LoginPage;

public class Login_TC02 extends Base_test {
	@Test
	public void To_login() {
		DW_HomePage hp=new DW_HomePage(driver);
		hp.click_login();
		
		DW_LoginPage lp=new DW_LoginPage(driver);
		lp.enter_email("chinmayimohan77@gmail.com");
		lp.enter_password("chin@123");
		lp.login_click();
		
	}

}
