package testng_basics;

import org.testng.annotations.Test;

public class Workingwith_smokesuite2 {

@Test(groups="smoketest",priority=2)
public void search() {
	System.out.println("Executing search Tc");
}
@Test(priority=4)
public void wishlist() {
	System.out.println("Executing wishlist Tc");
	
}


}
