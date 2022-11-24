package testng_basics;

import org.testng.annotations.Test;

public class Workingwith_multipletest {
	@Test
	public void bookshop() {
		System.out.println("Welcome to book shop");
	}
	@Test
	public void magnus() {
		System.out.println("Welcome Rakesh have Hookha");
	}
	@Test
	public void cultfit() {
		System.out.println("Welcome Rakesh drink hotwater and do 100 pushups");
	}
	@Test
	public void bangarpet() {
		System.out.println("Rakesh enjoy Masalpuri and go to gym");
	}
	@Test
	public void wineshop() {
		System.out.println("Think how much you should workout after having all the above ");
	}

}
