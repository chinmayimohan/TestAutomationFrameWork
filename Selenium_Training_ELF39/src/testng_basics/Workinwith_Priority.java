package testng_basics;

import org.testng.annotations.Test;

public class Workinwith_Priority {
	@Test(priority=1)
	public void register() {
		System.out.println("Executing register Tc");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Executing login Tc");
	}
	@Test(priority=3)
	public void search() {
		System.out.println("Executing search Tc");
	}
	@Test(priority=4)
	public void wishlist() {
		System.out.println("Executing wishlist Tc");
	}
	@Test(priority=5)
	public void logout() {
		System.out.println("Executing logout Tc");
	}


}
