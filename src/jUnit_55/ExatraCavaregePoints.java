package jUnit_55;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ExatraCavaregePoints {
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
	}

	/*@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}*/

	@Test
	void test() throws Exception {
		//fail("Not yet implemented");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("7032004119");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("chandra.");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
	}

}
