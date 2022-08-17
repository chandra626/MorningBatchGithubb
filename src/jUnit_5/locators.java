package jUnit_5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class locators {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chomedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.cloudflare.com/learning/ssl/what-is-ssl/");
	}

	/*@AfterAll
	static void tearDownAfterClass() throws Exception {
	}*/

	@Test
	void test() {
		//fail("Not yet implemented");
	}

}
