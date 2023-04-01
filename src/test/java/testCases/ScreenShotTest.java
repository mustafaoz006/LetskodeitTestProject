package testCases;


import org.testng.annotations.Test;

import utilities.Driver;

public class ScreenShotTest {
	
	@Test
	public void screenshotTest() {
		
		Driver.getDriver().get("https://google.de");
		
		Driver.makeScreenshot();
		
		Driver.quitDriver();

	}

}
