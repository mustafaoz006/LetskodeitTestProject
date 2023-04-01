package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
public static WebDriver driver;
public String baseUrl;

@BeforeSuite
public void setUp() {
	if (driver==null) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver= new ChromeDriver();	
		baseUrl="https://www.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
	}

}

@AfterSuite
public void quitDriver() {

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (driver != null) {
		driver.quit();
	}
	
}
}
