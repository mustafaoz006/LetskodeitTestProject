package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollingTest {
	
	private WebDriver driver;
	private JavascriptExecutor javascriptExecutor;
	
	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://usersnap.com/blog/long-scrolling-websites-tips-best-practices/");
	}
	
	@Test
	public void scrollTest() {
		
		WebElement footerElement = driver.findElement(By.cssSelector("#footer-feedback-form"));
		
		javascriptExecutor = (JavascriptExecutor) driver;
		
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", footerElement);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
