package testCases;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)

public class StartBrowserTest {
	
@Test
public void startChromeBrowser(ChromeDriver driver) {
	
	driver.get("https://google.de");

}

@Test
public void startFirefoxBrowser(FirefoxDriver driver) {
	
	driver.get("https://yahoo.de");

}
}
