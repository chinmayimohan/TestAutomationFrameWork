package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Workingwith_Propertyfile {
@Test
public void propertydemo() throws IOException {

String filepath="./Test_Configuration/TestConfigurationproperties";
FileInputStream fis=new FileInputStream(filepath);
//creating object for properties class
Properties prop=new Properties();
prop.load(fis);
System.out.println(prop.get("FirstName")+""+prop.get("LastName"));

}
}
