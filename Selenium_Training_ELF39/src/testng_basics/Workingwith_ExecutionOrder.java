package testng_basics;

import org.testng.annotations.Test;

public class Workingwith_ExecutionOrder {
	@Test
	public void register() {
		System.out.println("Executing register Tc");
	}
	@Test(dependsOnMethods="register")
	public void login() {
		System.out.println("Executing login Tc");
	}
	@Test(dependsOnMethods={"register","login"})
	public void search() {
		System.out.println("Executing search Tc");
	}
	@Test(dependsOnMethods="search")
	public void wishlist() {
		System.out.println("Executing wishlist Tc");
	}
	@Test(dependsOnMethods="wishlist")
	public void logout() {
		System.out.println("Executing logout Tc");
	}

}
