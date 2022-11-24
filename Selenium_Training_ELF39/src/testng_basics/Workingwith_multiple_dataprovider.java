package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Workingwith_multiple_dataprovider {
	@DataProvider(name="TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[5][2];
		data[0][0]="chinmayi";
		data[0][1]="mohan";
		data[1][0]="Skanda";
		data[1][1]="sai";
		data[2][0]="sidharth";
		data[2][1]="Hallera";
		data[3][0]="smitha";
		data[3][1]="Sunder raj";
		data[4][0]="Rakesh the Bunty";
		data[4][1]="nin soap slow-naa";
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String Lastname) {
		System.out.println( Firstname);
		System.out.println(Lastname);
}
}
