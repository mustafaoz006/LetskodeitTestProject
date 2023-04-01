package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	
	@DataProvider(name = "TestData")
	public Object[][] getData() {
		return new Object [][]  {{"bmwradio"},{"benzradio"},{"hondaradio"}};
		
	}
	

}
