package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.TestBase;

public class FensterWechseln extends TestBase{
	
	@Test
	private void fensterWechselnTest() {
		WebElement practiceLink = driver.findElement(By.id("PRACTICE"));
		practiceLink.click();
		WebElement	buttonElement = driver.findElement(By.id("openwindow"));
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		buttonElement.click();
		
		Set<String> windowHandels = driver.getWindowHandles();
		
		for (String window : windowHandels) {
			if(!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				
				WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'ALL COURSES')]"));
				allCourses.click();
				WebElement searchText = driver.findElement(By.xpath("//input[@id='search']"));
				searchText.sendKeys("JavaScript");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.close();
				break;
			}
			
		}
		
		driver.switchTo().window(mainWindow);
		WebElement checkBmw = driver.findElement(By.id("bmwcheck"));
		checkBmw.click();
	 }

}
