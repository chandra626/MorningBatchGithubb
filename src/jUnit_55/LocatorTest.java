package jUnit_55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorTest {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedrier.exe");
		Thread.sleep(2000);
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	/*@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}*/

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("https://www.google.com/");
	}

}
