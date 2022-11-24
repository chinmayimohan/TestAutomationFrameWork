package DM_TestCase;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_DemoWebshop.DW_HomePage;

public class Search_TC03 extends Base_test {
@Test
public void To_Search() {
DW_HomePage hp= new DW_HomePage(driver);
hp.search_field("computers");
hp.click_search_button();
}
}
