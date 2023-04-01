package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.DataProviderUtil;
import utilities.TestBase;

public class RadioButtonTest extends TestBase{
	

	@Test(dataProvider  = "TestData", dataProviderClass = DataProviderUtil.class)
	public void radioButtonTest(String radioButton) {
		//WebElement practiceLink = driver.findElement(By.xpath("//a[contains(text(),'PRACTICE')]"));
		//practiceLink.click();
		WebElement radioButtontest = driver.findElement(By.id(radioButton)); 
		radioButtontest.click();
			  
			  Assert.assertTrue(radioButtontest.isSelected());
			  
			  }



	/*
	 * @Test private void radioButtonBmwTest() { WebElement radioButtonBmw =
	 * driver.findElement(By.id("bmwradio")); radioButtonBmw.click();
	 * 
	 * Assert.assertTrue(radioButtonBmw.isSelected());
	 * 
	 * }
	 * 
	 * @Test(priority = 1) private void radioButtonBenzTest() { WebElement
	 * radioButtonBenz = driver.findElement(By.id("benzradio"));
	 * radioButtonBenz.click();
	 * 
	 * Assert.assertTrue(radioButtonBenz.isSelected());
	 * 
	 * }
	 * 
	 * @Test(priority = 2) private void radioButtonHondaTest() { WebElement
	 * radioButtonHonda = driver.findElement(By.id("hondaradio"));
	 * radioButtonHonda.click();
	 * 
	 * Assert.assertTrue(radioButtonHonda.isSelected());
	 * 
	 * }
	 */

	
	
	

}
