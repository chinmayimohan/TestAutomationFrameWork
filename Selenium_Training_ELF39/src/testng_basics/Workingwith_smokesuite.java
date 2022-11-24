package testng_basics;

import org.testng.annotations.Test;

public class Workingwith_smokesuite {
	
		@Test(groups="smoketest",priority=1)
		public void register() {
			System.out.println("Executing register Tc");
		}
		@Test(groups="smoketest",priority=3)
		public void login() {
			System.out.println("Executing login Tc");
		}
		@Test(priority=5)
		public void logout() {
			System.out.println("Executing logout Tc");
		}

	}
