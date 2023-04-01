package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.Driver;


public class WaitImplExpl {
	private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 6);
	
	@Test
	private void startButtonTest() {
Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Start')]")).click();
String startButtonText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish"))).getText();
System.out.println(startButtonText);

Driver.quitDriver();
	}
	
	

}
