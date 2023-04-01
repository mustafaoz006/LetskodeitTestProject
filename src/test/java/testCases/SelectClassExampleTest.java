package testCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.TestBase;

public class SelectClassExampleTest extends TestBase {
	List<WebElement> listenAutos;
	Select selectAutos;
	
	@BeforeClass
	private void setUpBeforeClass() {

		WebElement selectElement = driver.findElement(By.id("carselect"));
		selectAutos = new Select(selectElement);
		
		listenAutos = selectAutos.getOptions();
		
	}

	@Test(priority = 1)
	private void selectBmwTest() {

		selectAutos.selectByValue("bmw");
		
		Assert.assertTrue(listenAutos.get(0).isSelected());
	}
	@Test(priority = 2)
	private void selectBenzTest() {

		selectAutos.selectByValue("benz");
		
		Assert.assertTrue(listenAutos.get(1).isSelected());
	}

	@Test(priority = 3)
	private void selectHondaTest() {

		selectAutos.selectByValue("honda");
		
		Assert.assertTrue(listenAutos.get(2).isSelected());
	}

}
