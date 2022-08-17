package x_path;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class LlinkTexrt {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.get("http://www.seleniumlearn.com");
		
	}
@Disabled
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		
		driver.findElement(By.linkText("Java")).click();
		driver.close();
		
	}

}
