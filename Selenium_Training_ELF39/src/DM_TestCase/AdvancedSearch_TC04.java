package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_AdvancedSearchPage;
import POM_DemoWebshop.DW_HomePage;

public class AdvancedSearch_TC04 extends Base_test {
@Test
public void To_AdvancedSearch() {
	DW_HomePage hp=new DW_HomePage(driver);
	hp.search_field("computers");
	hp.click_search_button();
	DW_AdvancedSearchPage advp=new DW_AdvancedSearchPage(driver);
	advp.check_advancesearch();
	advp.Select_categorylist();
	advp.check_SearchSubCatogries();
	advp.select_Manufacturer();
	advp.enter_fromPrice("30000");
	advp.enter_toPrice("40000");
	advp.check_productDescription();
	advp.click_searchbutton();
}
}
