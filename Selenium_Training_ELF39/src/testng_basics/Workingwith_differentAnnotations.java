package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Workingwith_differentAnnotations {
@Test
public void medicalshop() {
	System.out.println("Welcome to medicalshop");
}
@Test
public void vegetableshop() {
	System.out.println("Welcome to vegetableshop");
}
@BeforeClass
public void beforeclass() {
	System.out.println("Executing beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("Executing afterclass");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("Executing beforemethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("Executing aftermethod");
	
}
@BeforeSuite
public void beforesuite() {
	System.out.println("Executing beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("Executing aftersuite");
}
@BeforeMethod
public void beforemethod1() {
	System.out.println("Executing beforemethod1");
}
}
