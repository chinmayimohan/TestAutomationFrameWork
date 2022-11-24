package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingwith_dataprovider {
@DataProvider(name="TestData")
public Object[][] testdata(){
	Object[][] data=new Object[1][2];
	data[0][0]="chinmayi";
	data[0][1]="mohan";
	return data;
}
@Test(dataProvider="TestData")
public void testdatademo(String Firstname,String Lastname) {
	System.out.println( Firstname);
	System.out.println(Lastname);
}
}
