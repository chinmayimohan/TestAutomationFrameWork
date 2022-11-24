package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;

public class DW_vote_TC extends Base_test{
@Test
public void To_Vote() {
	DW_HomePage hp=new DW_HomePage(driver);
	
	hp.vote_Excellent();
	
}
}
