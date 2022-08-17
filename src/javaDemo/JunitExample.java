package javaDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitExample {
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
	void test1() throws Throwable {
		//	fail("Not yet implemented");
		driver.get("https://www.womenfirstfund.org/");
		Thread.sleep(2000);
		driver.get("https://www.womenfirstfund.org/our-story");

	}

	@Disabled
	@Test
	void test2() throws Throwable {
		//	fail("Not yet implemented");
		driver.get("https://play.google.com/store/apps/details?id=com.nettia&hl=en_US&gl=US");
		Thread.sleep(2000);
		driver.get("https://www.google.com/search?q=call+international&oq=call&aqs=chrome.1.69i57j0i67j46i67j46i67i433l2j46i67j0i131i433i512j46i67i131i433j0i433i512j0i512.13134j0j7&sourceid=chrome&ie=UTF-8");

	}


	@Test
	void test3() throws Throwable {
		//	fail("Not yet implemented");
		driver.get("https://www.womenfirstfund.org/");
		Thread.sleep(2000);
		driver.get("https://www.womenfirstfund.org/our-story");

	}
}
