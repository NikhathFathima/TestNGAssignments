package tesngselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment54_DataProvider_multipleInput_SkeletonProg {
	@Test(dataProvider="Set1")
	public void method1(String FN, String LN, String Eml, String DB, String Gdr)
	{
		System.out.println(FN+" "+LN+" "+Eml+" "+Gdr+" "+DB);
	}
	
	@DataProvider(name="Set1")
	public Object[][] data1()
	{
		Object[][] dataset = new Object[10][5];
		//FirstName Data
		dataset[0][0] = "FN0";
		dataset[1][0] = "FN1";
		dataset[2][0] = "FN2";
		dataset[3][0] = "FN3";
		dataset[4][0] = "FN4";
		dataset[5][0] = "FN5";
		dataset[6][0] = "FN6";
		dataset[7][0] = "FN7";
		dataset[8][0] = "FN8";
		dataset[9][0] = "FN9";
		//LastName Data
		dataset[0][1] = "LN0";
		dataset[1][1] = "LN1";
		dataset[2][1] = "LN2";
		dataset[3][1] = "LN3";
		dataset[4][1] = "LN4";
		dataset[5][1] = "LN5";
		dataset[6][1] = "LN6";
		dataset[7][1] = "LN7";
		dataset[8][1] = "LN8";
		dataset[9][1] = "LN9";	
		//Email Data
		dataset[0][2] = "Eml0";
		dataset[1][2] = "Eml1";
		dataset[2][2] = "Eml2";
		dataset[3][2] = "Eml3";
		dataset[4][2] = "Eml4";
		dataset[5][2] = "Eml5";
		dataset[6][2] = "Eml6";
		dataset[7][2] = "Eml7";
		dataset[8][2] = "Eml8";
		dataset[9][2] = "Eml9";	
		//DOB Data
		dataset[0][3] = "DOB0";
		dataset[1][3] = "DOB1";
		dataset[2][3] = "DOB2";
		dataset[3][3] = "DOB3";
		dataset[4][3] = "DOB4";
		dataset[5][3] = "DOB5";
		dataset[6][3] = "DOB6";
		dataset[7][3] = "DOB7";
		dataset[8][3] = "DOB8";
		dataset[9][3] = "DOB9";	
		//Gender Data
		dataset[0][4] = "G0";
		dataset[1][4] = "G1";
		dataset[2][4] = "G2";
		dataset[3][4] = "G3";
		dataset[4][4] = "G4";
		dataset[5][4] = "G5";
		dataset[6][4] = "G6";
		dataset[7][4] = "G7";
		dataset[8][4] = "G8";
		dataset[9][4] = "G9";
		return dataset;	
		
	}
}
