package javaDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit_5Class {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
	}
@Disabled
	@Test
	void test2() {
		//fail("Not yet implemented");
		driver.get("https://www.facebook.com/home.php");
		driver.navigate().back();
	}
//@Ignore for 3&4  junit
@Test
void test3() {
	//fail("Not yet implemented");
	driver.get("https://ww5.7movierulz.sk/");
	driver.navigate().back();
}
}
